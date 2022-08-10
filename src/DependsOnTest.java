import org.testng.annotations.Test;
public class DependsOnTest {
  @Test //(dependsOnMethods = { "OpenBrowser" })
  public void SignIn() {
	  System.out.println("SignIn User has signed in successfully");
  }
  
  @Test
  public void OSignIn1() {
	  System.out.println("SignIn-1 User has signed in successfully");
  }
  
  @Test
  public void OpenBrowser() {
	  System.out.println("The browser is opened");
  }

  @Test (dependsOnMethods = { "OSignIn1","SignIn", "OpenBrowser" })
  public void LogOut() {
	  System.out.println("The user logged out successfully");
  }
}