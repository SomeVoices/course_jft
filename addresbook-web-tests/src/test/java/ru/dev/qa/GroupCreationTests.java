package ru.dev.qa;

import org.testng.annotations.*;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    gotoGroupPage();
    initialGroupCreation();
    fillGroupForm(new GroupData("group3", "group3", "group3"));
    submitGroupCreation();
    returntoGroupPage();
  }

}
