package duck.spring.itsol.services.phancong;

import duck.spring.itsol.models.PhanCong;

import java.util.List;
import java.util.Optional;

public interface PhanCongService {
    Optional<PhanCong> findPhanCongByMaPc(String maPC);
    List<PhanCong> findAllPhanCong();
    PhanCong createPhanCong(PhanCong phanCong);
    PhanCong updatePhanCong(PhanCong phanCong);
    void deletePhanCongByMaPc(String maPC);

}
