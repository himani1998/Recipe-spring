package himani.recipe.Recipespring.controllers;

import himani.recipe.Recipespring.domain.Recipe;
import himani.recipe.Recipespring.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class RecipeController {
    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping("/recipe/show/{id}")
    public Recipe getRecipesName(@PathVariable String id){
        return recipeService.findById(Long.parseLong(id));
    }

    @RequestMapping("/recipe/save")
    public Recipe saveRecipe(@RequestBody Recipe recipe){
        return recipeService.saveRecipe(recipe);
    }

    @RequestMapping("/recipe/delete/{id}")
    public String deleteRecipe(@PathVariable String id){
        return recipeService.deleteRecipe(Long.parseLong(id));
    }
}



