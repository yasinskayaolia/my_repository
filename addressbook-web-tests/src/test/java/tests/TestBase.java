package tests;

import appmanager.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;




public class TestBase {

  protected final ApplicationManager app = new ApplicationManager(BrowserType.CHROME);

  @BeforeMethod
  public void setUp() throws Exception {
    app.init();
      // вызов метода потому, что используется переменная wd, которая есть атрибутом объекта типа GroupCreationTests
  }

  @AfterMethod
  public void tearDown() {
    app.stop();
  }

}
