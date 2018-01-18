package tests;

import model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {

  @Test
  public void testGroupModification() {
    app.getNavigatorHelper().gotoGroupPage();
    int before = app.getGroupHelPer().getGroupCount();
    if (! app.getGroupHelPer().isThereAGroup()) {
      app.getGroupHelPer().createGroup(new GroupData("test1", null, null));
    }
    app.getGroupHelPer().selectGroup();
    app.getGroupHelPer().initGroupModification();
    app.getGroupHelPer().fillGroupForm(new GroupData("test1", null, null));
    app.getGroupHelPer().submitGroupModification();
    app.getGroupHelPer().returnToGroupPage();
    int after = app.getGroupHelPer().getGroupCount();
    Assert.assertEquals(after, before);
  }
}
