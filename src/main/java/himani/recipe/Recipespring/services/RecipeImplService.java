package himani.recipe.Recipespring.services;

import himani.recipe.Recipespring.domain.Recipe;
import himani.recipe.Recipespring.repositories.RecipeRepository;

import java.util.HashSet;
import java.util.Set;

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
}
