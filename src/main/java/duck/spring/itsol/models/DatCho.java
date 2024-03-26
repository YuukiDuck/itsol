package duck.spring.itsol.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "DatCho")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DatCho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "MAKH")
    private User user;

    @ManyToOne
    @JoinColumn(name = "NGAYDI")
    private LichBay lichBay;

    @ManyToOne
    @JoinColumn(name = "MACB")
    private ChuyenBay chuyenBay;

}
