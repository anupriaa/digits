package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;

/**
 * Mockup model for backend database.
 */
@Entity
public class DietType extends Model {
  @Id
  private long id;
  private String dietType = "";
  @ManyToMany (mappedBy = "dietTypes")
  ArrayList<Contact> contacts = new ArrayList<Contact>();

  /**
   * constructs a new instance with the passed diet type.
   * @param dietType the diet type.
   */
  public DietType(String dietType) {
    this.dietType = dietType;
  }

  /**
   * The EBean ORM finder method for database queries.
   * @return The finder method.
   */
  public static Model.Finder<Long, DietType> find() {
    return new Model.Finder<Long, DietType>(Long.class, DietType.class);
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
   * Gets the diet type.
   * @return the diet type.
   */
  public String getDietType() {
    return dietType;
  }

  /**
   * Sets the new diet type.
   * @param dietType the diet type.
   */
  public void setDietType(String dietType) {
    this.dietType = dietType;
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
