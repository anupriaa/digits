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

  private static Map<Long, Contact> contacts = new HashMap<>();
  private static long currentId = 1;

  /**
   * Creates a Contact instance and adds it to an internal data structure.
   * If form id was 0, create a new id for this new contact else update the previous entry.
   * @param formData the form data.
   */
  public static void addContact(ContactFormData formData) {
    long idVal = (formData.id == 0) ? currentId++ : formData.id;
    Contact contact = new Contact(idVal, formData.firstName, formData.lastName, formData.telephone);
    contacts.put(idVal, contact);
  }

  /**
   * Returns the contact associated with the id or throws a run time exception if contact not found.
   * @param id The id.
   * @return The contact.
   */
  public static Contact getContact(long id) {
    Contact contact = contacts.get(id);
    if (contact == null) {
      throw new RuntimeException("Could not find the contact with associated id");
    }
    return contact;
  }
  /**
   * Returns the contact list.
   * @return the contact list.
   */
  public  static List<Contact> getContacts() {
    return new ArrayList<>(contacts.values());
  }
}
