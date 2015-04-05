package models;

/**
 * Mockup model for backend database.
 */
public class Contact {
  private String firstName;
  private String lastName;
  private String telephone;
  private long id;

  /**
   * Creates an instance of Contact.
   * @param id the id.
   * @param firstName the frst name.
   * @param lastName the last name.
   * @param telephone the telephone number.
   */
  public Contact(long id, String firstName, String lastName, String telephone) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.telephone = telephone;
    this.id = id;
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
}
