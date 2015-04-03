package views.formdata;

import play.data.validation.ValidationError;

import java.util.ArrayList;
import java.util.List;

/**
 * Backing class for the new contact form.
 * Created by Anupriya on 4/2/2015.
 */
public class ContactFormData {
  /** Constant to hold the length of telephone number.*/
  private static final int TELEPHONE_LEN = 12;
  /** String to hold first name. */
   public String firstName = "";
  /** String to hold last name. */
   public String lastName = "";
  /** String to hold telephone number of the format xxx-xxx-xxxx. */
   public String telephone = "";

  /**
   * Checks if the form fields are valid. Called bu bindRequestForm().
   * @return null if no errors else ist of errors.
   */
  public List<ValidationError> validate() {
    List<ValidationError> errors = new ArrayList<>();

    if (firstName == null || firstName.length() == 0) {
      errors.add(new ValidationError("firstName", "First Name is required"));
    }
    if (lastName == null || lastName.length() == 0) {
      errors.add(new ValidationError("lastName", "Last Name is required"));
    }
    if (telephone == null || telephone.length() == 0) {
      errors.add(new ValidationError("telephone", "Telephone is required"));
    }
    if
        (telephone.length() != TELEPHONE_LEN) {
      errors.add(new ValidationError("telephone", "Telephone Number should be xxx-xxx-xxxx"));
    }
    return errors.isEmpty() ? null : errors;
  }
}
