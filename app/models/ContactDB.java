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
   * @param formData the form data.
   */
  public static void addContact(ContactFormData formData) {
    long idVal = (formData.id == 0) ? currentId++ : formData.id;
    Contact contact = new Contact(idVal, formData.firstName,
                                  formData.lastName, formData.telephone, formData.telephoneType);
    contacts.put(idVal, contact);
  }

  /**
   * Returns associated contact with the id if it exists, else throws RunTimeException.
   * @param id the Id.
   * @return The contact.
   */
  public static Contact getContact(long id) {
    Contact contact = contacts.get(id);
    if (contact == null) {
      throw new RuntimeException("Could not find the associated contact with the id.");
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
