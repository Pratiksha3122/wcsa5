package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathfilp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.flipkart.com/");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Top for girl");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2doB4z')]")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	}

}
