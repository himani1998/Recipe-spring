package himani.recipe.Recipespring.controllers;

import himani.recipe.Recipespring.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class ImageController {
    private final RecipeService recipeService;

    public ImageController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

}
