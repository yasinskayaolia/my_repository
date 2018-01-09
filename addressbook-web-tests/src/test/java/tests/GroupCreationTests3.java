package tests;

import org.testng.annotations.Test;
import model.GroupData;

public class GroupCreationTests3 extends TestBase {

    @Test
    public void testGroupCreation() {
        app.getNavigatorHelper().gotoGroupPage();
        app.getGroupHelPer().initGroupCreation();
        app.getGroupHelPer().fillGroupForm(new GroupData("test1", "test1", "test1"));
        app.getGroupHelPer().submitGroupCreation();
        app.getGroupHelPer().returnToGroupPage();
    }

}
