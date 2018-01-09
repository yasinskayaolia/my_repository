package appmanager;

import model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GroupHelPer {
  FirefoxDriver wd;

  public GroupHelPer(FirefoxDriver wd) {
    this.wd = wd;
  }

  public void returnToGroupPage() {
      wd.findElement(By.linkText("groups")).click();
  }

  public void submitGroupCreation() {
      wd.findElement(By.name("submit")).click();
  }

  public void fillGroupForm(GroupData groupData) {               // метод принимает один параметр типа GroupData
      wd.findElement(By.name("group_name")).click();
      wd.findElement(By.name("group_name")).clear();
      wd.findElement(By.name("group_name")).sendKeys(groupData.getName());
      wd.findElement(By.name("group_header")).click();
      wd.findElement(By.name("group_header")).clear();
      wd.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
      wd.findElement(By.name("group_footer")).click();
      wd.findElement(By.name("group_footer")).clear();
      wd.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
  }

  public void initGroupCreation() {
      wd.findElement(By.name("new")).click();
  }

  public void deleteSelectedGroups() {
      wd.findElement(By.name("delete")).click();
  }

  public void selectGroup() {
      if (!wd.findElement(By.xpath("//div[@id='content']/form/span[1]/input")).isSelected()) {
          wd.findElement(By.xpath("//div[@id='content']/form/span[1]/input")).click();
      }
  }
}
