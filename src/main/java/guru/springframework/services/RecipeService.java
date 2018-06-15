/**
 * Created by alexandruk on 6/15/2018.
 */
package guru.springframework.services;

import guru.springframework.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
