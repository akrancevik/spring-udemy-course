/**
 * Created by alexandruk on 6/22/2018.
 */
package guru.springframework.services;

import guru.springframework.commands.IngredientCommand;

public interface IngredientService {

    public IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand ingredientCommand);

    void deleteById(Long recipeId, Long ingredientId);
}
