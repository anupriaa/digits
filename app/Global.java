import models.ContactDB;
import models.DietType;
import models.TelephoneType;
import play.Application;
import play.GlobalSettings;
import views.formdata.ContactFormData;

import java.util.ArrayList;

/**
 * Create four contacts and add them to the ContactDB on system startup.
 */
public class Global extends GlobalSettings {

  @Override
  public void onStart(Application application) {
    super.onStart(application);
    ContactDB.addTelephoneType(new TelephoneType("Mobile"));
    ContactDB.addTelephoneType(new TelephoneType("Home"));
    ContactDB.addTelephoneType(new TelephoneType("Work"));
    ContactDB.addDietType(new DietType("Chicken"));
    ContactDB.addDietType(new DietType("Fish"));
    ContactDB.addDietType(new DietType("Beef"));
    ContactDB.addDietType(new DietType("Dairy"));
    ContactDB.addDietType(new DietType("Gluten"));
    ArrayList<String> diets = new ArrayList<String>();
    ContactDB.addContact(new ContactFormData("Anu", "Sinha", "789-789-7869", "Home", diets));
    ContactDB.addContact(new ContactFormData("Bharat", "Sinha", "789-789-7899", "Home", diets));
    ContactDB.addContact(new ContactFormData("Shivam", "Srivastava", "783-789-7899", "Home", diets));
    ContactDB.addContact(new ContactFormData("Arjun", "Sinha", "789-789-5899", "Work", diets));
  }
}
