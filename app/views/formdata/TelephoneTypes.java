package views.formdata;

import java.util.HashMap;
import java.util.Map;

/**
 * Utility class to manipulate telephone type .
 */
public class TelephoneTypes {
  private static String[] types = {"Home", "Work", "Mobile"};

  /**
   * To get the telephone types.
   * @return the map of telephone types.
   */
  public static Map<String, Boolean> getTypes() {
    Map<String, Boolean> typeMap = new HashMap<String, Boolean>();
    for (String type: types) {
      typeMap.put(type, false);
    }
    return typeMap;
  }

  /**
   * Checks if telephone type is valid or not.
   * @param type the telephone type.
   * @return true if valid telephone type, else false.
   */
  public static boolean isType(String type) {
    return getTypes().containsKey(type);
  }

  /**
   * Checks for acceptable telephone type and sets to true if selected.
   * @param type the telephone type.
   * @return the map of telephone types.
   */
  public static Map<String, Boolean> getTypes(String type) {
    Map<String, Boolean> typeMap = getTypes();
    if (isType(type)) {
      typeMap.put(type, true);
    }
    return typeMap;
  }
}
