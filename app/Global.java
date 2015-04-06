import models.ContactDB;
import play.Application;
import play.GlobalSettings;
import play.Logger;
import views.formdata.ContactFormData;

/**
 * Create four contacts and add them to the ContactDB on system startup.
 */
public class Global extends GlobalSettings {

  @Override
  public void onStart(Application application) {
    super.onStart(application);
    ContactDB.addContact(new ContactFormData("Anu", "Sinha", "789-789-7869", "Home"));
    ContactDB.addContact(new ContactFormData("Bharat", "Sinha", "789-789-7899", "Home"));
    ContactDB.addContact(new ContactFormData("Shivam", "Srivastava", "783-789-7899", "Home"));
    ContactDB.addContact(new ContactFormData("Arjun", "Sinha", "789-789-5899", "Work"));
  }
}
