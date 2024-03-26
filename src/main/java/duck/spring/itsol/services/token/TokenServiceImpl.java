package duck.spring.itsol.services.token;

import duck.spring.itsol.components.JwtTokenUtils;
import duck.spring.itsol.models.Token;
import duck.spring.itsol.models.User;
import duck.spring.itsol.repositories.TokenRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TokenServiceImpl implements TokenService{

    private static final int MAX_TOKENS = 3;

    @Value("${jwt.expiration}")
    private int expiration; //save to an environment variable

    @Value("${jwt.expiration-refresh-token}")
    private int expirationRefreshToken;

    private final TokenRepository tokenRepository;
    private final JwtTokenUtils jwtTokenUtil;

    @Override
    public Token addToken(User user, String token, boolean isMobileDevice) {
        return null;
    }

    @Override
    public Token refreshToken(String refreshToken, User user) throws Exception {
        return null;
    }
}
