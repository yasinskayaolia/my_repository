package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import model.GroupData;

import java.util.List;

public class GroupCreationTests3 extends TestBase {


    @Test
    public void testGroupCreation() {
        app.getNavigatorHelper().gotoGroupPage();
        List<GroupData> before = app.getGroupHelPer().getGroupList();
        //int before = app.getGroupHelPer().getGroupCount();      //количество групп до добавления
        app.getGroupHelPer().createGroup(new GroupData("test1", null, null));
        //int after = app.getGroupHelPer().getGroupCount();      // количество групп после добавления
        List<GroupData> after = app.getGroupHelPer().getGroupList();
        Assert.assertEquals(after.size(), before.size() + 1);
    }
}
