package himani.recipe.Recipespring.repositories;

import himani.recipe.Recipespring.domain.Category;
import himani.recipe.Recipespring.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {
     Optional<UnitOfMeasure> findByDescription(String description);
}
