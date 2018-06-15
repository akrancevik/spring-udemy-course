/**
 * Created by alexandruk on 6/15/2018.
 */
package guru.springframework.services;

import guru.springframework.domain.Recipe;
import guru.springframework.repositories.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {

    private RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {

        log.debug("I'm in the service!");

        Set<Recipe> recipees = new HashSet<>();

        recipeRepository.findAll().iterator().forEachRemaining(recipees::add);
        return recipees;
    }
}