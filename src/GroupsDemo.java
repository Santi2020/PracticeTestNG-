
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

public class GroupsDemo {		
	WebDriver driver;
    // Saving the expected title of the Webpage
    String title = "ToolsQA - Demo Website For Automation";
    
   
    @Test(priority =1 ,groups = { "demo" })
    public void starting_point(){
    	System.out.println("This is the starting point of the test");
    	System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver_win32/chromedriver.exe");
    	//Initialize Chrome Driver
    	//driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
    	 //driver = new ChromeDriver();
    	 //driver.get("https://demoqa.com/");
    	 System.out.println("End of starting point");
    }
    
    
    @Test(priority =2 ,groups = { "demo" })	
    public void checkTitle() {	
       String testTitle = "Free QA Automation Tools For Everyone";
       //String originalTitle = driver.getTitle();
       System.out.println("testTitle = " + testTitle);
       //System.out.println("originalTitle = " + originalTitle);
       //Assert.assertEquals(originalTitle, testTitle);
    }	
    
    @Test(priority =3 )	
    public void click_element() {	
       //driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[1]/a")).click();
        System.out.println("Home Page heading is displayed");	
    }
}