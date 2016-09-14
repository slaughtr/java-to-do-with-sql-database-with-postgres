import org.junit.*;
import static org.junit.Assert.*;

public class CategoryTest {

  @Test
  public void category_instantiatesCorrectly_true() {
    Category testCategory = new Category("Home");
    assertEquals(true, testCategory instanceof Category);
  }
}
