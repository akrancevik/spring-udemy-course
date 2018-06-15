/**
 * Created by alexandruk on 6/15/2018.
 */
package guru.springframework.repositories;

import guru.springframework.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long>{


    Optional<UnitOfMeasure> findByDescription(String description);
}
