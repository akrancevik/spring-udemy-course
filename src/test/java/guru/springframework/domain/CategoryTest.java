package guru.springframework.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alexandruk on 6/19/2018.
 */
public class CategoryTest {

    Category category;

    @Before
    public void setup(){
        category = new Category();
    }

    @Test
    public void testGetId() throws Exception {

        Long idValue = 4L;
        category.setId(idValue);

        assertEquals(idValue, category.getId());

    }

    @Test
    public void testGetDescription() throws Exception {

    }

    @Test
    public void testGetRecipes() throws Exception {

    }
}