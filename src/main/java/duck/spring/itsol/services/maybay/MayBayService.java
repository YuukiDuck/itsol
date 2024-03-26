package duck.spring.itsol.services.maybay;

import duck.spring.itsol.models.MayBay;

import java.util.List;
import java.util.Optional;

public interface MayBayService {
    Optional<MayBay> findMayBayBySoHieu(String soHieu);
    List<MayBay> findAllMayBay();
    MayBay createMayBay(MayBay mayBay);
    MayBay updateMayBay(MayBay mayBay);
    void deleteMayBayBySoHieu(String soHieu);

}
