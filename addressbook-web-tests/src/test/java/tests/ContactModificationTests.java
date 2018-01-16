package tests;

import model.ContactData;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase{

  @Test
  public void testContactModification() {
    app.getContactHelper().waitElement();
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("fname", "lname", "email", "mobile", "test1"), true);
    }
    app.getContactHelper().editContact();
    app.getContactHelper().fillContactFields(new ContactData("fname", "lname", "email", "mobile", null), false);
    app.getContactHelper().submitContactModification();
    app.getNavigatorHelper().gotoHomePage();
  }
}
