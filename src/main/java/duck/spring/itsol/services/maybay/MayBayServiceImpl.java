package duck.spring.itsol.services.maybay;

import duck.spring.itsol.models.MayBay;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MayBayServiceImpl implements MayBayService{
    @Override
    public Optional<MayBay> findMayBayBySoHieu(String soHieu) {
        return Optional.empty();
    }

    @Override
    public List<MayBay> findAllMayBay() {
        return null;
    }

    @Override
    public MayBay createMayBay(MayBay mayBay) {
        return null;
    }

    @Override
    public MayBay updateMayBay(MayBay mayBay) {
        return null;
    }

    @Override
    public void deleteMayBayBySoHieu(String soHieu) {

    }
}
