package views.formdata;

import java.util.HashMap;
import java.util.Map;

/**
 * Utilities class to support manipulation of telephone types map.
 */
public class TelephoneTypes {
  private static String[] types = {"Home", "Work", "Mobile"};

  /**
   * Builds a new map of telephone type, initialized to false.
   * @return The telephone type map.
   */
  public static Map<String, Boolean> getTypes() {
    Map<String, Boolean> typeMap = new HashMap<String, Boolean>();
    for (String type: types) {
      typeMap.put(type, false);
    }
    return typeMap;
  }

  /**
   * Checks if passed string is a legal telephone type.
   * @param telephoneType the telephone type.
   * @return true if passed string is a legal telephone type, else false.
   */
  public static boolean isType(String telephoneType) {
    return getTypes().containsKey(telephoneType);
  }

  /**
   * Builds a new map of telephone type, where map entry type is set to true.
   * @param type the telephone type
   * @return The map of telephone types.
   */

  public static Map<String, Boolean> getTypes(String type) {
    Map<String, Boolean> typeMap = getTypes();
    if (isType(type)) {
      typeMap.put(type, true);
    }
    return typeMap;
  }
}
