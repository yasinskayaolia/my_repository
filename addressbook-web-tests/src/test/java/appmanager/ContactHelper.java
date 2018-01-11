package appmanager;

import model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver wd) {
    super(wd);
  }


  public void fillContactForm(ContactData contactData) {
    fillContactFields(contactData);
  }

  public void fillContactFields(ContactData contactData) {
    wd.findElement(By.name("firstname")).sendKeys(contactData.getFname());
    wd.findElement(By.name("lastname")).sendKeys(contactData.getLname());
    wd.findElement(By.name("email")).sendKeys(contactData.getEmail());
    wd.findElement(By.name("mobile")).sendKeys(contactData.getMobile());
  }

  public void initContactForm() {
    addContact();
  }

  public void addContact() {
    wd.findElement(By.xpath("//a[@href='edit.php']")).click();
  }
}
