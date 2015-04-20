package models;

import java.util.ArrayList;

/**
 * Mockup model for backend database.
 */
public class Contact {
  private String firstName;
  private String lastName;
  private String telephone;
  private long id;
  private String telephoneType;
  private ArrayList<String> dietTypes;

  /**
   * Creates an instance of Contact.
   * @param id the id.
   * @param firstName the frst name.
   * @param lastName the last name.
   * @param telephone the telephone number.
   * @param telephoneType the telephone type.
   * @param dietTypes the diet type.
   */
  public Contact(long id, String firstName, String lastName, String telephone,
                 String telephoneType, ArrayList<String> dietTypes) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.telephone = telephone;
    this.id = id;
    this.telephoneType = telephoneType;
    this.dietTypes = dietTypes;
  }

  /**
   * Returns the first name.
   * @return the first name.
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Returns the last name.
   * @return the last name.
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Returns the telephone number.
   * @return the telephone number.
   */
  public String getTelephone() {
    return telephone;
  }
  /**
   * Returns the id.
   * @return the id.
   */
  public long getId() {
    return id;
  }

  /**
   * Returns the telephone type.
   * @return the telephone type.
   */
  public String getTelephoneType() {
    return telephoneType;
  }

  /**
   * Returns the diet type.
   * @return the list of diet types.
   */
  public ArrayList<String> getDietTypes() {
    return dietTypes;
  }
}
