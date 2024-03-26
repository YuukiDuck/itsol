package duck.spring.itsol.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserUpdateDto {
    @JsonProperty("TEN")
    private String ten;

    @JsonProperty("DIACHI")
    private String diaChi;

    @JsonProperty("DIENTHOAI")
    private String dienThoai;

    @JsonProperty("DATEOFBIRTH")
    private Date dateOfBirth;

    @JsonProperty("PASSWORD")
    private String Password;

    @JsonProperty("retype_password")
    private String retypePassword;
}
