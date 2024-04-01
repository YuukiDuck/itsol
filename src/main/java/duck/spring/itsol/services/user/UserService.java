
package duck.spring.itsol.services.user;

import duck.spring.itsol.dtos.UserDto;
import duck.spring.itsol.dtos.UserUpdateDto;
import duck.spring.itsol.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Optional<User> findUserByMakh(Long maKH);
    List<User> findAllUser();
    User createUser(UserDto userDto) throws Exception;

    String login(
            String email,
            String password
    ) throws Exception;

    User getUserDetailsFromToken(String token) throws Exception;
    User getUserDetailsFromRefreshToken(String token) throws Exception;
    User updateUser(long maKH, UserUpdateDto userUpdateDto) throws Exception;
    void deleteUser(Long maKh);
}
