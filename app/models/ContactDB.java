package models;

import views.formdata.ContactFormData;

import java.util.ArrayList;
import java.util.List;

/**
 * Mock-up in-memory repository for Contacts.
 */
public class ContactDB {

  private static List<Contact> contacts = new ArrayList<>();

  /**
   * Creates a Contact instance and adds it to an internal data structure.
   * @param formData the form data.
   */
  public static void addContact(ContactFormData formData) {
    Contact contact = new Contact(formData.firstName, formData.lastName, formData.telephone);
    contacts.add(contact);
  }

  /**
   * Returns the contact list.
   * @return the contact list.
   */
  public  static List<Contact> getContacts() {
    return contacts;
  }
}
