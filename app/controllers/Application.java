package controllers;

import models.ContactDB;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.formdata.ContactFormData;
import views.formdata.TelephoneTypes;
import views.html.Index;
import views.html.NewContact;

import java.util.Map;

/**
 * Provides controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page.
   * @return The resulting home page.
   */
  public static Result index() {
    return ok(Index.render(ContactDB.getContacts()));
  }

  /**
   * Returns newContact, a simple example of a second page to illustrate navigation.
   * @param id The id.
   * @return The NewContact.
   */
  public static Result newContact(long id) {
    ContactFormData data = (id == 0) ? new ContactFormData() : new ContactFormData(ContactDB.getContact(id));
    Form<ContactFormData> formData = Form.form(ContactFormData.class).fill(data);
    Map<String, Boolean> typeMap = TelephoneTypes.getTypes(data.telephoneType);
    return ok(NewContact.render(formData, typeMap));
  }
  /**
   * Handles the http POST request for new Contact form.
   * @return The recent data added to the new Contact form.
   */
  public static Result postContact() {
    Form<ContactFormData> formData = Form.form(ContactFormData.class).bindFromRequest();
    if (formData.hasErrors()) {
      return badRequest(NewContact.render(formData, TelephoneTypes.getTypes()));
    }
    else {
      ContactFormData data = formData.get();
      ContactDB.addContact(data);
      System.out.printf("%s, %s, %s, %n", data.firstName, data.lastName, data.telephone);
      return ok(NewContact.render(formData, TelephoneTypes.getTypes(data.telephoneType)));
    }
  }

}
