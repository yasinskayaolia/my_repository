package appmanager;

import model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void fillContactFields(ContactData contactData, boolean creation) { // если этого поля не будет, тест упадет, поэтому добавляем boolean(в котором передается инфо, что сейчас мы делаем: создаем контакт или модифицируем его)
    wd.findElement(By.name("firstname")).sendKeys(contactData.getFname());
    wd.findElement(By.name("lastname")).sendKeys(contactData.getLname());
    wd.findElement(By.name("email")).sendKeys(contactData.getEmail());
    wd.findElement(By.name("mobile")).sendKeys(contactData.getMobile());

    if (creation) {                                                                                 // элемент есть
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
    } else {
      Assert.assertFalse(isElementPresent(By.name("new_group")));                                // элемента нету
    }
  }


  public void initContactForm() {
    addContact();
  }

  public void addContact() {
    wd.findElement(By.xpath("//a[@href='edit.php']")).click();
  }

  private void submitContact() {
    submitContactData();
  }
  public void editContact() {
    editContactData();
  }

  public void submitContactModification() {
    click(By.name("update"));
  }

}
