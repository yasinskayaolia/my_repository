package tests;

import model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GroupModificationTests extends TestBase {

  @Test
  public void testGroupModification() {
    app.getNavigatorHelper().gotoGroupPage();
    if (! app.getGroupHelPer().isThereAGroup()) {
      app.getGroupHelPer().createGroup(new GroupData("test1", null, null));
    }
    List<GroupData> before = app.getGroupHelPer().getGroupList();
    app.getGroupHelPer().selectGroup(before.size() - 1);
    app.getGroupHelPer().initGroupModification();
    app.getGroupHelPer().fillGroupForm(new GroupData("test1", null, null));
    app.getGroupHelPer().submitGroupModification();
    app.getGroupHelPer().returnToGroupPage();
    List<GroupData> after = app.getGroupHelPer().getGroupList();
    Assert.assertEquals(after.size(), before.size());
  }
}
