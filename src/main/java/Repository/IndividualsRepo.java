package Repository;

import Entities.Individuals;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IndividualsRepo extends JpaRepository<Individuals, Integer> {
    
}
