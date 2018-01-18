package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import model.GroupData;

public class GroupCreationTests3 extends TestBase {


    @Test
    public void testGroupCreation() {
        app.getNavigatorHelper().gotoGroupPage();
        int before = app.getGroupHelPer().getGroupCount();      //количество групп до добавления
        app.getGroupHelPer().createGroup(new GroupData("test1", null, null));
        int after = app.getGroupHelPer().getGroupCount();      // количество групп после добавления
        Assert.assertEquals(after, before + 1);
    }
}
