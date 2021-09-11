package ru.dev.qa.tests;

import org.testng.annotations.Test;
import ru.dev.qa.model.GroupData;

public class GroupModificationTests extends TestBase{

  @Test
  public void testGroupModification(){
    app.getNavigationHelper().gotoGroupPage();
    if (! app.getGroupHelper().isThereAGroup()){
      app.getGroupHelper().createGroup(new GroupData("group1", "group1", "group1"));
    }
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initialGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("upName1", "upHeader1", "upFooter1"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnToGroupPage();
  }
}
