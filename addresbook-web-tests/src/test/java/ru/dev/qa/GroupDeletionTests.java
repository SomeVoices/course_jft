package ru.dev.qa;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion() throws Exception {
    gotoGroupPage();
    selectGroup();
    deleteSelectedGroups();
    returntoGroupPage();
  }

}
