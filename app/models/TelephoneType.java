package models;

import java.util.ArrayList;

/**
 * Mockup model for backend database.
 */
public class TelephoneType {
  private long id;
  private String telephoneType = "";
  ArrayList<Contact> contacts = new ArrayList<Contact>();

  /**
   * constructs a new instance with the passed telephone type.
   * @param telephoneType the telephone type.
   */
  public TelephoneType(String telephoneType) {
    this.telephoneType = telephoneType;
  }

  /**
   * Adds the contacts.
   * @param contact the contact list.
   */
  public void addContact(Contact contact) {
    this.contacts.add(contact);
  }

  /**
   * Gets the id.
   * @return the id.
   */
  public long getId() {
    return id;
  }

  /**
   * Sets the new Id.
   * @param id the Id.
   */
  public void setId(long id) {
    this.id = id;
  }

  /**
   * Gets the telephone type.
   * @return the telephone type.
   */
  public String getTelephoneType() {
    return telephoneType;
  }

  /**
   * Sets the new telephone type.
   * @param telephoneType the telephone type.
   */
  public void setTelephoneType(String telephoneType) {
    this.telephoneType = telephoneType;
  }

  /**
   * Gets the contact list.
   * @return the contact list.
   */
  public ArrayList<Contact> getContacts() {
    return contacts;
  }

  /**
   * Sets the contact list.
   * @param contacts the contact list.
   */
  public void setContacts(ArrayList<Contact> contacts) {
    this.contacts = contacts;
  }
}
