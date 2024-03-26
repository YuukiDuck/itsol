package duck.spring.itsol.repositories;

import duck.spring.itsol.models.DatCho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatChoRepo extends JpaRepository<DatCho, Long> {
}
