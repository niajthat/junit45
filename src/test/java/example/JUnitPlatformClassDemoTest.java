package example;

import org.junit.Test;

public class JUnitPlatformClassDemoTest {

  @Test
  public void succeedingTest() {
    System.out.println("Inside success test");
  }

  @Test
  public void failingTest() {
    System.out.println("Inside fail test");
  }

}

