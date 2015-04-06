package tests;

import org.junit.Test;
import play.libs.F.Callback;
import play.test.TestBrowser;
import tests.pages.IndexPage;
import tests.pages.NewContactPage;

import static org.fest.assertions.Assertions.assertThat;
import static play.test.Helpers.HTMLUNIT;
import static play.test.Helpers.fakeApplication;
import static play.test.Helpers.inMemoryDatabase;
import static play.test.Helpers.running;
import static play.test.Helpers.testServer;

/**
 * Runs a server with a fake in-memory database to test the system.
 */
public class IntegrationTest {
  private final int testPort = 3333;

  /** Test simple retrieval of the index page. */
  @Test
  public void testRetrieveIndexPage() {
    running(testServer(testPort, fakeApplication(inMemoryDatabase())), HTMLUNIT, new Callback<TestBrowser>() {
      @Override
      public void invoke(TestBrowser browser) {
        browser.maximizeWindow();
        IndexPage indexPage = new IndexPage(browser.getDriver(), testPort);
        browser.goTo(indexPage);
        indexPage.isAt();
      }
    });
  }

  /**
   * Creates a new contact, then goes to Index page and verifies that the new contact now appears there.
   * @param firstName the first name.
   * @param lastName the last name.
   * @param telephone the telephone number.
   */
  public void testCreateNewContact(String firstName, String lastName, String telephone) {
    running(testServer(testPort, fakeApplication(inMemoryDatabase())), HTMLUNIT, new Callback<TestBrowser>() {
      @Override
      public void invoke(TestBrowser browser) {
        browser.maximizeWindow();
        IndexPage indexPage = new IndexPage(browser.getDriver(), testPort);
        NewContactPage contactPage = new NewContactPage(browser.getDriver(), testPort);
        browser.goTo(contactPage);
        contactPage.isAt();
        String firstName = "Anu";
        String lastName = "Sinha";
        String telephone = "213-789-7896";
        contactPage.createContact(firstName, lastName, telephone);
        browser.goTo(indexPage);
        indexPage.hasContact(firstName, lastName, telephone);
      }
    });
  }

}
