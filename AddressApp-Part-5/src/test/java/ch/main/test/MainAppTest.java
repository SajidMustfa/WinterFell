
package ch.main.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import ch.makery.address.*;

public class MainAppTest {
	MainApp objMA =new MainApp();
  @Test
  public void TestClass() {
	  Object actual=objMA.getPersonFilePath();
	  Object expected=null;
	  Assert.assertEquals(actual, expected);
  }
  @BeforeMethod
  public void beforeMethod() {
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
