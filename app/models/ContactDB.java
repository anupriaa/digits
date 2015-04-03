package models;

import views.formdata.ContactFormData;

import java.util.ArrayList;
import java.util.List;

/**
 * Mockup in-memory repository for Contacts.
 */
public class ContactDB {
  private static List<Contact> contacts = new ArrayList<>();

  /**
   * Creates an instance of contact an adds it to a an internal data structure.
   * @param formData the form data.
   */
  public static void addContact(ContactFormData formData) {
    Contact contact = new Contact(formData.firstName, formData.lastName, formData.telephone);
    contacts.add(contact);
  }

  /**
   * Returns the contacts.
   * @return the contact list.
   */
  public static List<Contact> getContacts() {
    return contacts;
  }
}
