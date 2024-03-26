package duck.spring.itsol.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class MayBay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SOHIEU")
    private String soHieu;

    @ManyToOne
    @JoinColumn(name = "MALOAI")
    private LoaiMayBay loaiMayBay;
}



