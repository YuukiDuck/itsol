package duck.spring.itsol.repositories;

import duck.spring.itsol.models.PhanCong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhanCongRepo extends JpaRepository<PhanCong, Long> {
}
