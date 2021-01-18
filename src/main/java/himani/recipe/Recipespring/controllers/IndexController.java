package himani.recipe.Recipespring.controllers;

import himani.recipe.Recipespring.domain.Category;
import himani.recipe.Recipespring.domain.UnitOfMeasure;
import himani.recipe.Recipespring.repositories.CategoryRepository;
import himani.recipe.Recipespring.repositories.UnitOfMeasureRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class IndexController {
    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping("/index")
    public String index(){
        Optional<Category> categoryOptional= categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional= unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Cat Id is: " + categoryOptional.get().getId());
        System.out.println("UOM ID is: " + unitOfMeasureOptional.get().getId());
        return "index";

    }
}
