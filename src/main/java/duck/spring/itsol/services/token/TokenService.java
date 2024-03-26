package duck.spring.itsol.services.token;

import duck.spring.itsol.models.Token;
import duck.spring.itsol.models.User;
import org.springframework.stereotype.Service;

@Service
public interface TokenService {
    Token addToken(User user, String token, boolean isMobileDevice);
    Token refreshToken(String refreshToken, User user) throws Exception;
}
