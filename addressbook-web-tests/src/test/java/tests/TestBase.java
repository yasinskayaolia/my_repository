package tests;

import appmanager.ApplicationManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;




public class TestBase {

  // Делаем ссылку на ApplicationManager общей для всех тестов. Для этого её нужно объявить static. Переменная static становится независимой,
// она не является частью какого-то объекта. Это самостоятельная глобальная переменная.
  protected static final ApplicationManager app = new ApplicationManager(BrowserType.FIREFOX);
  public WebDriver wd;
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
