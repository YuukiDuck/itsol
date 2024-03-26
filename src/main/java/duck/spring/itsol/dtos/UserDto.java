package duck.spring.itsol.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDto {
    @JsonProperty("email")
    private String Email;

    @JsonProperty("password")
    private String Password;

    @JsonProperty("TEN")
    private String ten;

    @JsonProperty("DIACHI")
    private String diaChi;

    @JsonProperty("DIENTHOAI")
    private String dienThoai;

    private String RetypePassword;

    @NotNull(message = "Role ID is required")
    @JsonProperty("role_id")
    private Long roleId;
}
