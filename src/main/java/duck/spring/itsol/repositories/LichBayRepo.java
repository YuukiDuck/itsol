package duck.spring.itsol.repositories;

import duck.spring.itsol.models.LichBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LichBayRepo extends JpaRepository<LichBay, Long> {
}
