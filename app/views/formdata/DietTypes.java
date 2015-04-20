package views.formdata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Utility class to manipulate diet type .
 */
public class DietTypes {
  private static String[] types = {"Dairy", "Fish", "Chicken", "Beef", "Gluten"};
  /**
   * To get the diet types.
   * @return the map of diet types.
   */
  public static Map<String, Boolean> getTypes() {
    Map<String, Boolean> typeMap = new HashMap<String, Boolean>();
    for (String type: types) {
      typeMap.put(type, false);
    }
    return typeMap;
  }
  /**
   * Checks for acceptable diet type and sets to true if selected.
   * @param type the diet type list.
   * @return the map of selected diet types.
   */
  public static Map<String, Boolean> getTypes(ArrayList<String> type) {
    Map<String, Boolean> typeMap = getTypes();
    if (isType(type)) {
      for (String a : type) {
        typeMap.put(a, true);
      }

    }
    return typeMap;
  }
  /**
   * Checks if diet type is valid or not.
   * @param type the diet type.
   * @return true if valid diet type, else false.
   */
  public static boolean isType(ArrayList<String> type) {
    return getTypes().containsKey(type);
  }
}
