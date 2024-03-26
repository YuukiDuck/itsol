package duck.spring.itsol.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "DATCHO")
public class KhaNang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "MAKH")
    private User user;

    @ManyToOne
    @JoinColumn(name = "ngay_Di")
    private LichBay lichBay;

    @ManyToOne
    @JoinColumn(name = "MACB") // Khóa ngoại liên kết đến bảng ChuyenBay
    private ChuyenBay chuyenBay;
}
