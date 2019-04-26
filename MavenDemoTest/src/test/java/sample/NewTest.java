package sample;

import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class NewTest {
	
  @Test
  public void f() {
	  Logger log=Logger.getLogger(NewTest.class.getClass());
	  PropertyConfigurator.configure("log4j.properties");
	  System.out.println("sample test executed");
	  log.info("sample test");
  }
  @Test
  public void test2() {
	  Logger log=Logger.getLogger(NewTest.class);
	  PropertyConfigurator.configure("log4j.properties");
	  
int a=20;
int b=30;
Assert.assertEquals(50, a+b);
System.out.println("Test case2 executed successfully in class1");  
log.info("sample calculation");  
  }

//something doing change
}
