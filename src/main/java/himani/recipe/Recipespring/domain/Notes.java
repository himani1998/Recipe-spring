package himani.recipe.Recipespring.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
public class Notes {

    @Id
    private String id;
    private String recipeNotes;
}
