package assingmentPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
               WebDriver driver =new ChromeDriver();
               driver.manage().window().maximize();
               Thread.sleep(1000);
               driver.get("https://demowebshop.tricentis.com/");
             
	}

}
