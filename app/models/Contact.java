package models;

/**
 * mock-up model for backend database.
 */
public class Contact {
  private String firstName;
  private String lastName;
  private String telephone;

  /**
   * Creates an Contact instance.
   * @param firstName the first name.
   * @param lastName the last name.
   * @param telephone the telephone number.
   */
  public Contact(String firstName, String lastName, String telephone) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.telephone = telephone;
  }

  /**
   * Returns the First Name.
   * @return the first name.
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Returns the Last Name.
   * @return the last name.
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Returns the telephone Name.
   * @return the telephone name.
   */
  public String getTelephone() {
    return telephone;
  }
}
