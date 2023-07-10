package assingmentPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PopUp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
      ChromeOptions option = new ChromeOptions();
      option.addArguments("Incongnito");
      
      WebDriver driver =new ChromeDriver(option);
      driver.get("https://www.monsterindia.com/");
	}

}
