package himani.recipe.Recipespring.services;

import himani.recipe.Recipespring.domain.Ingredient;
import himani.recipe.Recipespring.domain.Recipe;
import himani.recipe.Recipespring.repositories.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Slf4j
@Service
public class RecipeImplService implements RecipeService {
    private final RecipeRepository recipeRepository;


    public RecipeImplService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        Set<Recipe> recipes= new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipes::add);
        return recipes;
    }

    @Override
    public Recipe findById(Long id) {
        Optional<Recipe> recipeOptional= recipeRepository.findById(id);
        if(recipeOptional.isPresent()){
            return recipeOptional.get();
        }
        return null;
    }

    @Override
    public Recipe saveRecipe(Recipe recipe) {
        return recipeRepository.save(recipe);
    }

    @Override
    public String deleteRecipe(Long id) {
        recipeRepository.deleteById(id);
        return "deleted";
    }

    @Override
    public Set<Ingredient> findIngredients(Long id) {
        Recipe recipe = this.findById(id);
        Set<Ingredient> ingredients= recipe.getIngredients();
        //ingredients.forEach(ingredient -> ingredient.setRecipe(null));
        return ingredients;
    }
}
