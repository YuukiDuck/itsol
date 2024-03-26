package duck.spring.itsol.repositories;

import duck.spring.itsol.models.LoaiMayBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoaiMayBayRepo extends JpaRepository<LoaiMayBay, Long> {
}
