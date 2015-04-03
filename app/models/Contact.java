package models;

/**
 * Mockup model for the backend database.
 * Created by Anupriya on 4/3/2015.
 */
public class Contact {
  private String firstName;
  private String lastName;
  private String telephone;

  /**
   * Creates a contact instance.
   * @param firstName the First Name
   * @param lastName The last name.
   * @param telephone The telephone number.
   */
  public Contact(String firstName, String lastName, String telephone) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.telephone = telephone;
  }

  /**
   * Returns the first name.
   * @return the first name.
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Returns the first name.
   * @return the first name.
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Returns the first name.
   * @return the first name.
   */
  public String getTelephone() {
    return telephone;
  }
}
