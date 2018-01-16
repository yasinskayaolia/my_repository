package appmanager;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import tests.TestBase;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class ApplicationManager extends TestBase {


  private ContactHelper contactHelper;
  private SessionHelper sessionHelper;
  private NavigatorHelper navigatorHelper;
  private GroupHelPer groupHelPer;
  private String browser;

  public ApplicationManager(String browser) {
    this.browser = browser;
  }


  public void init() {
    if (Objects.equals(browser, BrowserType.FIREFOX)) {
      wd = new FirefoxDriver();
    } else if (Objects.equals(browser, BrowserType.CHROME)) {
      wd = new ChromeDriver();
    } else if (Objects.equals(browser, BrowserType.IE)) {
      wd = new InternetExplorerDriver();
    }
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); // при проверке отсутствия элементов этот таймаут очень мешает
    wd.get("http://localhost:8080/addressbook/");
    contactHelper = new ContactHelper(wd);
    groupHelPer = new GroupHelPer(wd);
    navigatorHelper = new NavigatorHelper(wd);
    sessionHelper = new SessionHelper(wd);
    sessionHelper.login("admin", "secret");
  }

  public void stop() {
    wd.quit();
  }

  public GroupHelPer getGroupHelPer() {
    return groupHelPer;
  }


  public NavigatorHelper getNavigatorHelper() {
    return navigatorHelper;
  }

  public ContactHelper getContactHelper() {
    return contactHelper;
  }

  public void setContactHelper(ContactHelper contactHelper) {
    this.contactHelper = contactHelper;
  }
}
