package ru.dev.qa.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.dev.qa.model.GroupData;

public class GroupHelper extends HelperBase {

  public GroupHelper(ChromeDriver wd) {
    super(wd);
  }

  public void initialGroupCreation() { click(By.name("new")); }

  public void deleteSelectedGroups() { click(By.name("delete")); }

  public void selectGroup() { click(By.name("selected[]")); }

  public void initialGroupModification(){ click(By.name("edit")); }

  public void returnToGroupPage() { click(By.linkText("group page")); }

  public void submitGroupCreation() {
    click(By.name("submit"));
  }

  public void submitGroupModification() {
    click(By.name("update"));
  }


  public void fillGroupForm(GroupData groupData) {
    type(By.name("group_name"), groupData.getName());
    type(By.name("group_header"), groupData.getHeader());
    type(By.name("group_footer"), groupData.getFooter());
  }


  public void createGroup(GroupData group) {
    initialGroupCreation();
    fillGroupForm(new GroupData("group3", "group3", "group3"));
    submitGroupCreation();
    returnToGroupPage();
  }

  public boolean isThereAGroup() {
    return isElementPresent(By.name("selected[]"));
  }
}
