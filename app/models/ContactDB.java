package models;

import views.formdata.ContactFormData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Mock-up in-memory repository for Contacts.
 */
public class ContactDB {

  /*private static Map<Long, Contact> contacts = new HashMap<>();
  private static Map<String, TelephoneType> telephoneTypes = new HashMap<>();
  private static Map<String, DietType> dietTypes = new HashMap<>();
  private static long currentId = 1;*/

  /**
   * Creates a Contact instance and adds it to an internal data structure.
   * @param formData the form data.
   */
  public static void addContact(ContactFormData formData) {
    TelephoneType telephoneType = getTelephoneType(formData.telephoneType);
    ArrayList<DietType> dietTypes = new ArrayList<>();
    for (String dietString : formData.dietTypes) {
      dietTypes.add(getDietType(dietString));
    }
    Contact contact = new Contact(formData.firstName,
                                  formData.lastName, formData.telephone, telephoneType, dietTypes);
    contact.save();
  }

  /**
   * Returns the type associated with the typeString or throws a RuntimeException if not found.
   * @param typeString the telephone type.
   * @return the telephone type instance if found.
   */
  public static TelephoneType getTelephoneType(String typeString) {
    TelephoneType telephoneType = TelephoneType.find().where().eq("TelephoneType", typeString).findUnique();
    if (telephoneType == null) {
      throw new RuntimeException("Illegal telephone type" + typeString);
    }
    return telephoneType;
  }

  /**
   * Updates db with new telephone type.
   * @param telephoneType the telephone type to be added.
   */
  public static void addTelephoneType(TelephoneType telephoneType) {
    telephoneType.save();

  }

  /**
   * Returns the type associated with the typeString or throws a RuntimeException if not found.
   * @param typeString the diet type.
   * @return the diet type instance if found.
   */
  public static DietType getDietType(String typeString) {

    DietType dietType = DietType.find().where().eq("DietType", typeString).findUnique();
    if (dietType == null) {
      throw new RuntimeException("Illegal diet type" + typeString);
    }
    return dietType;
  }

  /**
   * Updates db with new diet type.
   * @param dietType the diet type to be added.
   */
  public  static void addDietType(DietType dietType) {
    dietType.save();
  }

  /**
   * Returns associated contact with the id if it exists, else throws RunTimeException.
   * @param id the Id.
   * @return The contact.
   */
  public static Contact getContact(long id) {
    Contact contact = Contact.find().byId(id);
    if (contact == null) {
      throw new RuntimeException("Could not find the associated contact with the id.");
    }
    return contact;
  }
  /**
   * Returns the contact list.
   * @return the contact list.
   */
  public  static ArrayList<Contact> getContacts() {
    return new ArrayList<>(Contact.find().all());
  }

}
