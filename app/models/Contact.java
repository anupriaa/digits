package models;

import play.db.ebean.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;

/**
 * Mockup model for backend database.
 */
@Entity
public class Contact extends Model {
  private String firstName;
  private String lastName;
  private String telephone;
  @Id
  private long id;
  @ManyToOne (cascade = CascadeType.PERSIST)
  private TelephoneType telephoneType;
  @ManyToMany (cascade = CascadeType.PERSIST)
  private ArrayList<DietType> dietTypes;

  /**
   * Creates an instance of Contact.
   * @param firstName the frst name.
   * @param lastName the last name.
   * @param telephone the telephone number.
   * @param telephoneType the telephone type.
   * @param dietTypes the diet type.
   */
  public Contact(String firstName, String lastName, String telephone,
                 TelephoneType telephoneType, ArrayList<DietType> dietTypes) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.telephone = telephone;
    this.id = id;
    this.telephoneType = telephoneType;
    this.dietTypes = dietTypes;
  }

  /**
   * The EBean ORM finder method for database queries.
   * @return The finder method.
   */
  public static Finder<Long, Contact> find() {
    return new Finder<Long, Contact>(Long.class, Contact.class);
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
  public TelephoneType getTelephoneType() {
    return telephoneType;
  }

  /**
   * Returns the diet type.
   * @return the list of diet types.
   */
  public ArrayList<DietType> getDietTypes() {
    return dietTypes;
  }

  /**
   * gets the diet type strings.
   * @return the concatinated diet type string.
   */
  public String getDietTypesString() {
    String diets = "";
    for (DietType diet : dietTypes) {
      diets += diet.getDietType() + ",";
    }
    return diets.substring(0, (diets.length() == 0 ? 0 : (diets.length() - 1)));
  }

  /**
   * Sets the first name.
   * @param firstName the first name.
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * Sets the last name.
   * @param lastName the last name.
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * Sets the the telephone number.
   * @param telephone the telephone number.
   */
  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  /**
   * sets the id.
   * @param id the id
   */
  public void setId(long id) {
    this.id = id;
  }

  /**
   * sets the telephone types.
   * @param telephoneType the telephone type.
   */
  public void setTelephoneType(TelephoneType telephoneType) {
    this.telephoneType = telephoneType;
  }

  /**
   * Sets diet types.
   * @param dietTypes list of diet types.
   */
  public void setDietTypes(ArrayList<DietType> dietTypes) {
    this.dietTypes = dietTypes;
  }
  /**
   * Returns a list of diet types for this string.
   * @return the list of diet type strings.
   */
  public ArrayList<String> getDietTypeList() {
    ArrayList<String> dietList = new ArrayList<>();
    for (DietType dietType : this.dietTypes) {
      dietList.add(dietType.getDietType());
    }
    return dietList;
  }
}
