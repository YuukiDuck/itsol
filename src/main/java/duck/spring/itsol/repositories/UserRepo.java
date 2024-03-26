package duck.spring.itsol.repositories;

import duck.spring.itsol.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    User findByMaKH(Long maKH);
    boolean existsByEmail(String Email);
    Optional<User> findByEmail(String Email);
}
