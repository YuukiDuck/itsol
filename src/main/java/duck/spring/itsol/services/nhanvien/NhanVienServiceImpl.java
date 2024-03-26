package duck.spring.itsol.services.nhanvien;

import duck.spring.itsol.models.NhanVien;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class NhanVienServiceImpl implements NhanVienService{
    @Override
    public Optional<NhanVien> findNhanVienByMaNv(String maNV) {
        return Optional.empty();
    }

    @Override
    public List<NhanVien> findAllNhanVien() {
        return null;
    }

    @Override
    public NhanVien createNhanVien(NhanVien nhanVien) {
        return null;
    }

    @Override
    public NhanVien updateNhanVien(NhanVien nhanVien) {
        return null;
    }

    @Override
    public void deleteNhanVienByMaNv(String maNV) {

    }
}
