package tests;

import org.testng.annotations.Test;

public class DeleteContact extends TestBase{

  @Test
  public void testDeleteContact() throws InterruptedException {
    app.getGroupHelPer().checkContact();
    app.getGroupHelPer().deleteContact();
   }
}
