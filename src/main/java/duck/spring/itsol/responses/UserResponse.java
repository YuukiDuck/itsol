package duck.spring.itsol.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserResponse {
    @JsonProperty("id")
    private Long maKH;

    @JsonProperty("fullname")
    private String ten;

    @JsonProperty("phone_number")
    private String dienThoai;

    @JsonProperty("address")
    private String diaChi;

    @JsonProperty("is_active")
    private boolean active;

    @JsonProperty("date_of_birth")
    private Date dateOfBirth;

    @JsonProperty("facebook_account_id")
    private int facebookAccountId;

    @JsonProperty("google_account_id")
    private int googleAccountId;

    @JsonProperty("role")
    private duck.spring.itsol.models.Role role;
    public static UserResponse fromUser(duck.spring.itsol.models.User user) {
        return UserResponse.builder()
                .maKH(user.getMaKH())
                .ten(user.getTen())
                .dienThoai(user.getDienThoai())
                .diaChi(user.getDiaChi())
                .active(user.isActive())
                .dateOfBirth(user.getDateOfBirth())
                .facebookAccountId(user.getFacebookAccountId())
                .googleAccountId(user.getGoogleAccountId())
                .role(user.getRole())
                .build();
    }
}
