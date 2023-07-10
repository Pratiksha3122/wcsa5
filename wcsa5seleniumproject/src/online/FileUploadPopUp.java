package online;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      driver.get("https://www.monsterindia.com/");
      driver.findElement(By.xpath("//div[contains(text(),' Upload Resume')]")).click();
       driver.findElement(By.id("file-upload")).sendKeys("‪C:\\Users\\User\\Desktop\\Stop actiTIME.lnk");
	}
	
}
