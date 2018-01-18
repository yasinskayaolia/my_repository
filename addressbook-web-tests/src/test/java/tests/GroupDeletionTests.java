package tests;

import model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GroupDeletionTests extends TestBase {

    @Test
    public void testGroupDeletion() {
        app.getNavigatorHelper().gotoGroupPage();
        if (! app.getGroupHelPer().isThereAGroup()) {
            app.getGroupHelPer().createGroup(new GroupData("test1", null, null));
        }
        List<GroupData> before = app.getGroupHelPer().getGroupList();
        app.getGroupHelPer().selectGroup(before.size() - 1);
        app.getGroupHelPer().deleteSelectedGroups();
        app.getGroupHelPer().returnToGroupPage();
        List<GroupData> after = app.getGroupHelPer().getGroupList();
        Assert.assertEquals(after.size(), before.size() - 1);

        //before.remove(before.size() -1);
        //for (int i = 0; i < after.size(); i++) {
          //  Assert.assertEquals(before.get(i), after.get(i));

                                                                    //можно либо так, либо так
       before.remove(before.size() -1);
       Assert.assertEquals(before, after);
        }
    }

