package tests.pages;

import org.fluentlenium.core.FluentPage;
import org.openqa.selenium.WebDriver;

import static org.fest.assertions.Assertions.assertThat;

/**
 * Implements the page object pattern for the index page of this application.
 */
public class NewContactPage extends FluentPage {
  private String url;

  /**
   * Create the IndexPage.
   * @param webDriver The driver.
   * @param port The port.
   */
  public NewContactPage(WebDriver webDriver, int port) {
    super(webDriver);
    this.url = "http://localhost:" + port + "/newContact";
  }

  @Override
  public String getUrl() {
    return this.url;
  }

  @Override
  public void isAt() {
    assertThat(title()).isEqualTo("New Contact (digits)");
  }

  /**
   * Creates a new contact for testing.
   * @param firstName the first name.
   * @param lastName the last name.
   * @param telephone the telephone number.
   */
  public void createContact(String firstName, String lastName, String telephone) {
    fill("#firstName").with(firstName);
    fill("#lastName").with(lastName);
    fill("#telephone").with(telephone);
    submit("#submit");
  }

}
