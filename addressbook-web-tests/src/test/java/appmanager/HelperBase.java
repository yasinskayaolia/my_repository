package appmanager;

import model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class HelperBase {
    protected WebDriver wd;

  public HelperBase(WebDriver wd) {
    this.wd = wd;
  }

  protected void click(By locator) {
    wd.findElement(locator).click();
  }

  protected void type(By locator, String text) {
    click(locator);
    if (text != null) {
      String existingText = wd.findElement(locator).getAttribute("value");  // тот текст, который мы видим в поле ввода, это не текст, это значение аттрибута value
      if (! text.equals(existingText)) {
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
      }
    }
  }

  protected void clean_user() {
    wd.findElement(By.name("user")).click();
    wd.findElement(By.name("user")).clear();
    wd.findElement(By.name("user")).sendKeys();
  }

  protected void clean_password() {
    wd.findElement(By.name("pass")).click();
    wd.findElement(By.name("pass")).clear();
    wd.findElement(By.name("pass")).sendKeys();
  }

  public  boolean isAlertPresent() {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }


  public void submitContactData() {
    wd.findElement(By.name("submit")).click();
  }

  protected boolean isElementPresent(By locator) {      // метод для проверки наличия или отсутствия элемента
    try {
      wd.findElement(locator);
      return true;
  } catch (NoSuchElementException ex) {
      return false;
    }
  }

  public void editContact() {
    editContactData();
  }

  public void editContactData() {
    wd.findElement(By.xpath("//a[contains(@href,'edit.php?id')]")).click();
  }

  public void waitElement() {
    wd.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
  }
}
