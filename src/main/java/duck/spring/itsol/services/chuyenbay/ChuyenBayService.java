package duck.spring.itsol.services.chuyenbay;

import duck.spring.itsol.models.ChuyenBay;

import java.util.List;
import java.util.Optional;

public interface ChuyenBayService {
    Optional<ChuyenBay> findChuyenBayByMacb(String maCB);
    List<ChuyenBay> findAllChuyenBay();
    ChuyenBay createChuyenBay(ChuyenBay chuyenBay);
    ChuyenBay updateChuyenBay(ChuyenBay chuyenBay);
    void deleteById(String maCB);
}
