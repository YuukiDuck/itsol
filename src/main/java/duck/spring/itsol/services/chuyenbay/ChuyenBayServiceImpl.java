package duck.spring.itsol.services.chuyenbay;

import duck.spring.itsol.models.ChuyenBay;
import duck.spring.itsol.repositories.ChuyenBayRepo;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ChuyenBayServiceImpl implements ChuyenBayService{
    private final ChuyenBayRepo chuyenBayRepo;

    @Override
    public Optional<ChuyenBay> findChuyenBayByMacb(String maCB) {
        return Optional.empty();
    }

    @Override
    public List<ChuyenBay> findAllChuyenBay() {
        return chuyenBayRepo.findAll();
    }

    @Override
    public ChuyenBay createChuyenBay(ChuyenBay chuyenBay) {
        return chuyenBayRepo.save(chuyenBay);
    }

    @Override
    public ChuyenBay updateChuyenBay(ChuyenBay chuyenBay) {
        return chuyenBayRepo.save(chuyenBay);
    }

    @Override
    public void deleteById(String maCB) {
    chuyenBayRepo.deleteById(maCB);
    }
}
