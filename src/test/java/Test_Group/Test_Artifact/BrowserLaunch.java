package Test_Group.Test_Artifact;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserLaunch {

	@Test
	public void browsermethod() {
		
		
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.quit();
		System.out.println("Successfull");
	}

}
