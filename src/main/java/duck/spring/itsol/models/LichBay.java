package duck.spring.itsol.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date; // Consider using LocalDate if appropriate
import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "LICHBAY")
public class LichBay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NGAYDI")
    private String ngayDi;

    @ManyToOne
    @JoinColumn(name = "MACB")
    private ChuyenBay chuyenBay;

    @ManyToOne
    @JoinColumn(name = "SOHIEU")
    private MayBay mayBay;

    @ManyToOne
    @JoinColumn(name = "MALOAI")
    private LoaiMayBay loaiMayBay;
}
