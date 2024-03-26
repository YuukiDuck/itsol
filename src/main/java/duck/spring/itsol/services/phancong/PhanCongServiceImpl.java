package duck.spring.itsol.services.phancong;

import duck.spring.itsol.models.PhanCong;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PhanCongServiceImpl implements PhanCongService{
    @Override
    public Optional<PhanCong> findPhanCongByMaPc(String maPC) {
        return Optional.empty();
    }

    @Override
    public List<PhanCong> findAllPhanCong() {
        return null;
    }

    @Override
    public PhanCong createPhanCong(PhanCong phanCong) {
        return null;
    }

    @Override
    public PhanCong updatePhanCong(PhanCong phanCong) {
        return null;
    }

    @Override
    public void deletePhanCongByMaPc(String maPC) {

    }
}
