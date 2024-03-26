package duck.spring.itsol.models;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "LOAIMB")
public class LoaiMayBay {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MALOAI")
    private Long maLoai;

    @Column(name = "HANGSX")
    private String hangSanXuat;

}
