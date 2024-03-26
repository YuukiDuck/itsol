package duck.spring.itsol.services.loaimaybay;

import duck.spring.itsol.models.LoaiMayBay;

import java.util.List;
import java.util.Optional;

public interface LoaiMayBaService {
    Optional<LoaiMayBay> findLoaiMayBayByMaLoai(String maLoai);
    List<LoaiMayBay> findAllLoaiMayBay();
    LoaiMayBay createLoaiMayBay(LoaiMayBay loaiMayBay);
    LoaiMayBay updateLoaiMayBay(LoaiMayBay loaiMayBay);
    void deleteLoaiMayBayByMaLoai(String maLoai);

}
