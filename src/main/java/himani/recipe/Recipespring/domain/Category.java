package himani.recipe.Recipespring.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.lang.annotation.Documented;
import java.util.Set;

@Getter
@Setter
@Document
public class Category {
    @Id
    private String id;
    private String description;

    @DBRef
    private Set<Recipe> recipes;
}