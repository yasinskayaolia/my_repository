package tests;


import model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

  @Test
  public void testCreateContact() {
    app.getContactHelper().initContactForm();
    app.getContactHelper().fillContactFields(new ContactData("fname", "lname", "email", "mobile", "test1"), true);
    app.getGroupHelPer().submitContactData();
    app.getNavigatorHelper().gotoHomePage();
  }
}
