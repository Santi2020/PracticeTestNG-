import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
 
public class TestNG {
 @Test(priority =2)
 public void z_testCase1() {
   System.out.println("This is the z_testCase1"); 
 }
 
 @Test(priority =2)
 public void a_testCase2() {
   System.out.println("This is the a_testCase2"); 
 }

 @Test
	public void d_method() {
		System.out.println("This is D Method");
	}
		
	@Test
	public void c_method() {
		System.out.println("This is C Method");
}
 @BeforeMethod
 public void beforeMethod() {
   System.out.println("This will execute before every Method");
 }
 
 @AfterMethod
 public void afterMethod() {
   System.out.println("This will execute after every Method");
 }
 
 @BeforeClass
 public void beforeClass() {
   System.out.println("This will execute before the Class");
 }
 
 @AfterClass
 public void afterClass() {
   System.out.println("This will execute after the Class");
 }
 
 @BeforeTest
 public void beforeTest() {
   System.out.println("This will execute before the Test");
 }
 
 @AfterTest
 public void afterTest() {
   System.out.println("This will execute after the Test");
 }
 
 @BeforeSuite
 public void beforeSuite() {
   System.out.println("This will execute before the Test Suite");
 }
 
 @AfterSuite
 public void afterSuite() {
   System.out.println("This will execute after the Test Suite");
 }
}


/*
 
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
//import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.testng.annotations.*;

public class TestNG {
	WebDriver driver ;
	@Test
	public void f() throws InterruptedException {
	  
	    //String baseUrl2 = "https://www.toolsqa.com/";
	    String baseUrl = "https://www.google.com/";
	    	System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver_win32/chromedriver.exe");
	        System.out.println("Launching Google Chrome browser"); 
	        
	        driver = new ChromeDriver();
	        
	        driver.get(baseUrl);
	        Thread.sleep(1000);
	        //String testTitle1 = "Free QA Automation Tools For Everyone";
	        String testTitle = "Google";
	        String originalTitle = driver.getTitle();
	        System.out.println("originalTitle = " + originalTitle);
	        Assert.assertEquals(originalTitle, testTitle);
	        
  }
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Starting Test On Chrome Browser");
	}
	
	@AfterMethod
	public void afterMethod() {
		 //driver.close();
		System.out.println("Finished Test On Chrome Browser");
	}
	
}


*/