package ru.dev.qa;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTest {

  @Test
  public void areaTest(){
    Square s = new Square(5);
    Assert.assertEquals(s.area(), 25.0);
  }
}
