package duck.spring.itsol.repositories;

import duck.spring.itsol.models.ChuyenBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChuyenBayRepo extends JpaRepository<ChuyenBay, String> {
    void deleteById(String maCB);
}
