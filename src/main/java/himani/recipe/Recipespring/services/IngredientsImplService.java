package himani.recipe.Recipespring.services;

import himani.recipe.Recipespring.domain.Ingredient;
import himani.recipe.Recipespring.repositories.IngredientRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class IngredientsImplService implements IngredientService{

    private final IngredientRepository ingredientRepository;

    public IngredientsImplService(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public Ingredient findById(Long id) {
        Optional<Ingredient> ingredient= ingredientRepository.findById(id);
        if(ingredient.isPresent()){
           Ingredient ingredient1= ingredient.get();
//           Recipe recipe=ingredient1.getRecipe();
//           recipe.setIngredients(null);
//           recipe.setNotes(null);
//           recipe.setCategories(null);
//           ingredient1.setRecipe(recipe);
           return ingredient1;
        }
        return null;
    }

    public Ingredient save(Ingredient ingredient){
        Ingredient intgredient2= ingredientRepository.save(ingredient);
        //intgredient2.setRecipe(null);
        return intgredient2;
    }
    @Override
    public String deleteIngredient(Long id) {
        ingredientRepository.deleteById(id);
        return "deleted";
    }
}
