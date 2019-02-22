package StepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class MyStepDef {
	
	public WebDriver driver;
	
	
      @Given("^Test$")
	public void test() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hemant Namdev\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}
}
