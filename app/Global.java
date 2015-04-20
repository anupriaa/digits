import models.ContactDB;
import play.Application;
import play.GlobalSettings;
import play.Logger;
import views.formdata.ContactFormData;

import java.util.ArrayList;

/**
 * Create four contacts and add them to the ContactDB on system startup.
 */
public class Global extends GlobalSettings {

  @Override
  public void onStart(Application application) {
    super.onStart(application);
    ArrayList<String> testdiet1 = new ArrayList<String>();
    ArrayList<String> testdiet2 = new ArrayList<String>();
    ArrayList<String> testdiet3 = new ArrayList<String>();
    ArrayList<String> testdiet4 = new ArrayList<String>();

    testdiet1.add(0,"Dairy");
    testdiet2.add(0,"Dairy");
    testdiet3.add(0,"Chicken");
    testdiet3.add(1, "Beef");
    testdiet4.add(0,"Dairy");
    ContactDB.addContact(new ContactFormData("Anu", "Sinha", "789-789-7869", "Home", testdiet1));
    ContactDB.addContact(new ContactFormData("Bharat", "Sinha", "789-789-7899", "Home", testdiet2));
    ContactDB.addContact(new ContactFormData("Shivam", "Srivastava", "783-789-7899", "Home", testdiet3));
    ContactDB.addContact(new ContactFormData("Arjun", "Sinha", "789-789-5899", "Work", testdiet4));
  }
}
