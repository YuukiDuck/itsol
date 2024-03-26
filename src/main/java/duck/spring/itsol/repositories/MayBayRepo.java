package duck.spring.itsol.repositories;

import duck.spring.itsol.models.MayBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MayBayRepo extends JpaRepository<MayBay, Long> {
}
