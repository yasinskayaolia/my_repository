package tests;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {

    @Test
    public void testGroupDeletion() {
        app.getNavigatorHelper().gotoGroupPage();
        app.getGroupHelPer().selectGroup();
        app.getGroupHelPer().deleteSelectedGroups();
        app.getGroupHelPer().returnToGroupPage();
    }
}
