
package duck.spring.itsol.services.user;

import duck.spring.itsol.components.JwtTokenUtils;
import duck.spring.itsol.components.LocalizationUtils;
import duck.spring.itsol.dtos.UserDto;
import duck.spring.itsol.dtos.UserUpdateDto;
import duck.spring.itsol.exceptions.DataNotFoundException;
import duck.spring.itsol.exceptions.ExpiredTokenException;
import duck.spring.itsol.models.Role;
import duck.spring.itsol.models.Token;
import duck.spring.itsol.models.User;
import duck.spring.itsol.repositories.RoleRepo;
import duck.spring.itsol.repositories.TokenRepository;
import duck.spring.itsol.repositories.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;
    private final RoleRepo roleRepo;
    private final TokenRepository tokenRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtTokenUtils jwtTokenUtil;
    private final AuthenticationManager authenticationManager;
    private final LocalizationUtils localizationUtils;
    private Authentication authentication;

    @Override
    public Optional<User> findUserByMakh(Long maKH) {
        return Optional.empty();
    }

    @Override
    public List<User> findAllUser() {
        return userRepo.findAll();
    }

    //    @Override
//    @Transactional
//    public User createUser(UserDto userDto) throws Exception {
//        String Email = userDto.getEmail();
//
//        if (userRepo.existsByEmail(Email)) {
//            throw new DataIntegrityViolationException("email đã tồn tại");
//        }
//        Role role = roleRepo.findById(userDto.getRoleId())
//                .orElseThrow(() -> new DataNotFoundException(
//                        localizationUtils.getLocalizedMessage(MessageKeys.ROLE_DOES_NOT_EXISTS)));
//        if (role.getName().toUpperCase().equals(Role.ADMIN)) {
//            throw new PermissionDenyException("Không được phép đăng ký tài khoản Admin");
//        }
//
//        User newUser = User.builder()
//                .ten(userDto.getTen())
//                .diaChi(userDto.getDiaChi())
//                .dienThoai(userDto.getDienThoai())
//                .email(userDto.getEmail())
//                .password(userDto.getPassword())
//                .build();
//
//        newUser.setRole(role);
//        return userRepo.save(newUser);
//    }
    @Override
    public User createUser(UserDto userDto) throws DataNotFoundException {
        String Email = userDto.getEmail();
        if (userRepo.existsByEmail(Email)) {
            throw new DataIntegrityViolationException("Email number alread exists");
        }
        User newUser = User.builder()
                .ten(userDto.getTen())
                .diaChi(userDto.getDiaChi())
                .dienThoai(userDto.getDienThoai())
                .email(userDto.getEmail())
                .password(userDto.getPassword())
                .build();
        Role role = roleRepo.findById(userDto.getRoleId())
                .orElseThrow(() -> new DataNotFoundException("Role not found"));

        newUser.setRole(role);
        return userRepo.save(newUser);
    }

    //    @Override
//    public String login(String email, String password, Long roleId) throws Exception {
//        Optional<User> optionalUser = userRepo.findByEmail(email);
//        if (optionalUser.isEmpty()) {
//            throw new DataNotFoundException(localizationUtils.getLocalizedMessage(MessageKeys.WRONG_EMAIL_PASSWORD));
//        }
////        return optionalUser.get();//muốn trả JWT token ?
//        User existingUser = optionalUser.get();
//        if (existingUser.getFacebookAccountId() == 0
//                && existingUser.getGoogleAccountId() == 0) {
//            if (!passwordEncoder.matches(password, existingUser.getPassword())) {
//                throw new BadCredentialsException(localizationUtils.getLocalizedMessage(MessageKeys.WRONG_EMAIL_PASSWORD));
//            }
//        }
//        Optional<Role> optionalRole = roleRepo.findById(roleId);
//        if (optionalRole.isEmpty() || !roleId.equals(existingUser.getRole().getId())) {
//            throw new DataNotFoundException(localizationUtils.getLocalizedMessage(MessageKeys.ROLE_DOES_NOT_EXISTS));
//        }
//        if (!optionalUser.get().isActive()) {
//            throw new DataNotFoundException(localizationUtils.getLocalizedMessage(MessageKeys.USER_IS_LOCKED));
//        }
//        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(
//                email, password,
//                existingUser.getAuthorities()
//        );
//
//        //authenticate with Java Spring security
//        authenticationManager.authenticate(authenticationToken);
//        return jwtTokenUtil.generateToken(existingUser);
//    }
    @Override
    public String login(String email, String password) throws Exception {
        Optional<User> optionalUser = userRepo.findByEmail(email);
        if (optionalUser.isEmpty()) {
            throw new DataNotFoundException("Invalid email / password");
        }

        User existingUser = optionalUser.get();

        if (existingUser.getFacebookAccountId() == 0
                && existingUser.getGoogleAccountId() == 0) {
            if (!passwordEncoder.matches(password, existingUser.getPassword())) {
                throw new BadCredentialsException("Wrong email or password");
            }
        }
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(email, password);
        //authenticate with java spring security
        authenticationManager.authenticate(authenticationToken);
        return jwtTokenUtil.generateToken(existingUser);
    }


    @Override
    public User getUserDetailsFromToken(String token) throws Exception {
        if (jwtTokenUtil.isTokenExpired(token)) {
            throw new ExpiredTokenException("Token is expired");
        }
        String Email = jwtTokenUtil.extractPhoneNumber(token);
        Optional<User> user = userRepo.findByEmail(Email);

        if (user.isPresent()) {
            return user.get();
        } else {
            throw new Exception("User not found");
        }
    }

    @Override
    public User getUserDetailsFromRefreshToken(String refreshToken) throws Exception {
        Token existingToken = tokenRepository.findByRefreshToken(refreshToken);
        return getUserDetailsFromToken(existingToken.getToken());
    }

    @Transactional
    @Override
    public User updateUser(long maKH, UserUpdateDto userUpdateDto) throws Exception {
        User existingUser = userRepo.findByMaKH(maKH);
//                .orElseThrow(() -> new DataNotFoundException("User not found"));

        if (userUpdateDto.getTen() != null) {
            existingUser.setTen(userUpdateDto.getTen());
        }

        if (userUpdateDto.getDiaChi() != null) {
            existingUser.setDiaChi(userUpdateDto.getDiaChi());
        }

        if (userUpdateDto.getDienThoai() != null) {
            existingUser.setDienThoai(userUpdateDto.getDienThoai());
        }

        if (userUpdateDto.getDateOfBirth() != null) {
            existingUser.setDateOfBirth(userUpdateDto.getDateOfBirth());
        }

        if (userUpdateDto.getPassword() != null
                && !userUpdateDto.getPassword().isEmpty()) {
            if (!userUpdateDto.getPassword().equals(userUpdateDto.getRetypePassword())) {
                throw new DataNotFoundException("Password and retype password not the same");
            }
            String newPassword = userUpdateDto.getPassword();
            String encodedPassword = passwordEncoder.encode(newPassword);
            existingUser.setPassword(encodedPassword);
        }
        return userRepo.save(existingUser);
    }

    @Override
    public void deleteUser(Long maKh) {

    }
}

