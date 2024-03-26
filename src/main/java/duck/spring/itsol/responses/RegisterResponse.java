package duck.spring.itsol.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import duck.spring.itsol.models.User;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterResponse {
    @JsonProperty("message")
    private String message;

    @JsonProperty("user")
    private User user;
}

