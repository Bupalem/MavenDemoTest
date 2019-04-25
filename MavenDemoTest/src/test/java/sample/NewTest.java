package sample;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class NewTest {
	Logger log=Logger.getLogger(NewTest.class);
  @Test
  public void f() {
	  System.out.println("sample test executed");
	  
  }
  @Test
  public void test2() {
int a=20;
int b=30;
Assert.assertEquals(50, a+b);
System.out.println("Test case2 executed successfully in class1");  
	  }

//something doing change
}
