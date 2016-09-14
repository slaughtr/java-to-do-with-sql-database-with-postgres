import org.junit.*;
import static org.junit.Assert.*;

public class CategoryTest {

  @Test
  public void category_instantiatesCorrectly_true() {
    Category testCategory = new Category("Home");
    assertEquals(true, testCategory instanceof Category);
  }

  @Test
  public void getName_categoryInstantiatesWithName_Home() {
    Category testCategory = new Category("Home");
    assertEquals("Home", testCategory.getName());
  }

  @Test
  public void all_returnsAllInstancesOfCategory_true() {
    Category firstCategory = new Category("Home");
    Category secondCategory = new Category("Work");
    assertEquals(true, Category.all().contains(firstCategory));
    assertEquals(true, Category.all().contains(secondCategory));
  }

  @Test
 public void clear_emptiesAllCategoriesFromList_0() {
   Category testCategory = new Category("Home");
   Category.clear();
   assertEquals(Category.all().size(), 0);
 }

}
