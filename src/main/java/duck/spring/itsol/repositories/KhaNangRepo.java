package duck.spring.itsol.repositories;

import duck.spring.itsol.models.KhaNang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KhaNangRepo extends JpaRepository<KhaNang, Long> {
}
