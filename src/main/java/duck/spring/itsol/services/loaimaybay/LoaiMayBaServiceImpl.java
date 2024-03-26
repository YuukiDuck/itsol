package duck.spring.itsol.services.loaimaybay;

import duck.spring.itsol.models.LoaiMayBay;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LoaiMayBaServiceImpl implements LoaiMayBaService{
    @Override
    public Optional<LoaiMayBay> findLoaiMayBayByMaLoai(String maLoai) {
        return Optional.empty();
    }

    @Override
    public List<LoaiMayBay> findAllLoaiMayBay() {
        return null;
    }

    @Override
    public LoaiMayBay createLoaiMayBay(LoaiMayBay loaiMayBay) {
        return null;
    }

    @Override
    public LoaiMayBay updateLoaiMayBay(LoaiMayBay loaiMayBay) {
        return null;
    }

    @Override
    public void deleteLoaiMayBayByMaLoai(String maLoai) {

    }
}
