package duck.spring.itsol.services.nhanvien;

import duck.spring.itsol.models.NhanVien;

import java.util.List;
import java.util.Optional;

public interface NhanVienService {
    Optional<NhanVien> findNhanVienByMaNv(String maNV);
    List<NhanVien> findAllNhanVien();
    NhanVien createNhanVien(NhanVien nhanVien);
    NhanVien updateNhanVien(NhanVien nhanVien);
    void deleteNhanVienByMaNv(String maNV);

}
