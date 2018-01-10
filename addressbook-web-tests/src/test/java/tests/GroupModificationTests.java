package tests;

import model.GroupData;
import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {

  @Test
  public void testGroupModification() {
    app.getNavigatorHelper().gotoGroupPage();
    app.getGroupHelPer().selectGroup();
    app.getGroupHelPer().initGroupModification();
    app.getGroupHelPer().fillGroupForm(new GroupData("test1", null, null));
    app.getGroupHelPer().submitGroupModification();
    app.getGroupHelPer().returnToGroupPage();
  }
}
