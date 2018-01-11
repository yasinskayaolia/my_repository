package tests;


import model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

  @Test
  public void testCreateContact() {
    app.getContactHelper().initContactForm();
    app.getContactHelper().fillContactForm(new ContactData("fname", "lname", "email", "mobile"));
  }
}
