package duck.spring.itsol.models;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PHANCONG")
public class PhanCong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "MANV")
    private User user;

    @ManyToOne
    @JoinColumn(name = "MACB")
    private ChuyenBay chuyenBay;

    @ManyToOne
    @JoinColumn(name = "NGAYDI")
    private LichBay lichBay;
}
