import java.util.List;
import java.util.ArrayList;

public class Category {
  private String mName;
  private static ArrayList<Category> instances = new ArrayList<Category>();

  public Category(String name) {
    mName = name;
    instances.add(this);
  }

  public String getName() {
    return mName;
  }

  public static ArrayList<Category> all() {
   return instances;
 }

 public static void clear() {
   instances.clear();
 }

}
