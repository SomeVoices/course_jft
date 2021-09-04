package ru.dev.qa.tests;

import org.testng.annotations.*;
import ru.dev.qa.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().initialGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("group3", "group3", "group3"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
  }

}
