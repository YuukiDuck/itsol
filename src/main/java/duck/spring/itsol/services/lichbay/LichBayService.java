package duck.spring.itsol.services.lichbay;

import duck.spring.itsol.models.LichBay;

import java.util.List;
import java.util.Optional;

public interface LichBayService {
    Optional<LichBay> findLichBayByMaCb(String maCB);
    List<LichBay> findAllLichBay();
    LichBay createLichBay(LichBay lichBay);
    LichBay updateLichBay(LichBay lichBay);
    void deleteLichBayByMaCb(String maCB);

}
