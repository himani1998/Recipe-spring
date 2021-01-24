package himani.recipe.Recipespring.repositories;

import himani.recipe.Recipespring.domain.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, Long> {

}
