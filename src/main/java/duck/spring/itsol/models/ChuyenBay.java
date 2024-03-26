package duck.spring.itsol.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ChuyenBay")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChuyenBay {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MACB", length = 15)
    private String  maCB;

    @Column(name = "SBDI", length = 50)
    private String sanBayDi;

    @Column(name = "SBDEN", length = 50)
    private String sanBayDen;

    @Column(name = "GIODI")
    private String gioDi;

    @Column(name = "GIODEN")
    private String gioDen;
}
