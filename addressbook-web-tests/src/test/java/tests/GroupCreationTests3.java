package tests;

import org.testng.annotations.Test;
import model.GroupData;

public class GroupCreationTests3 extends TestBase {

    @Test
    public void testGroupCreation() {
        app.getNavigatorHelper().gotoGroupPage();
        app.getGroupHelPer().createGroup(new GroupData("test1", null, null));
    }

}
