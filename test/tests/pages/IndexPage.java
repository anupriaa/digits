package tests.pages;

import org.fluentlenium.core.FluentPage;
import org.openqa.selenium.WebDriver;

import static org.fest.assertions.Assertions.assertThat;

/**
 * Implements the page object pattern for the index page of this application.
 */
public class IndexPage extends FluentPage {
  private String url;

  /**
   * Create the IndexPage.
   * @param webDriver The driver.
   * @param port The port.
   */
  public IndexPage(WebDriver webDriver, int port) {
    super(webDriver);
    this.url = "http://localhost:" + port;
  }

  @Override
  public String getUrl() {
    return this.url;
  }

  @Override
  public void isAt() {
    assertThat(title()).isEqualTo("Home (digits)");
  }

  /**
   *
   * @param firstName the firstname.
   * @param lastName the last name.
   * @param telephone the telephone number.
   */
  public void hasContact(String firstName, String lastName, String telephone) {
    assertThat(pageSource()).contains(firstName);
    assertThat(pageSource()).contains(lastName);
    assertThat(pageSource()).contains(telephone);
  }

}
