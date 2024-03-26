package duck.spring.itsol.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "NHANVIEN")
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MANV")
    private Long maNV;

    @Column(name = "TEN")
    private String ten;

    @Column(name = "DIACHI")
    private String diaChi;

    @Column(name = "DIENTHOAI")
    private String dienThoai;

    @Column(name = "LUONG")
    private double luong;

    @Column(name = "LOAINV")
    private String loaiNhanVien;

    @Column(name = "email")
    private String email;

    @JsonIgnore
    @Column(name = "password")
    private String password;
}
