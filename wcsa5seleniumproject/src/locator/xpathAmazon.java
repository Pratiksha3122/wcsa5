package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathAmazon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		     WebDriver driver =new ChromeDriver();
		     driver.manage().window().maximize();                
		     driver.get("https://www.amazon.in/");
		     Thread.sleep(1000);
		     driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Dairy milk");
		     Thread.sleep(1000);
		     driver.findElement(By.xpath("//input[@type='submit']")).click();
		    
	}

}
