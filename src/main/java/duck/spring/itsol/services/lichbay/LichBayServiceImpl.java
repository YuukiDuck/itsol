package duck.spring.itsol.services.lichbay;

import duck.spring.itsol.models.LichBay;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LichBayServiceImpl implements LichBayService{
    @Override
    public Optional<LichBay> findLichBayByMaCb(String maCB) {
        return null;
    }

    @Override
    public List<LichBay> findAllLichBay() {
        return null;
    }

    @Override
    public LichBay createLichBay(LichBay lichBay) {
        return null;
    }

    @Override
    public LichBay updateLichBay(LichBay lichBay) {
        return null;
    }

    @Override
    public void deleteLichBayByMaCb(String maCB) {

    }
}
