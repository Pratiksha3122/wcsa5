package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathLocator3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
                  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
                 WebDriver driver=new ChromeDriver();
                 driver.manage().window().maximize();
               driver.get("https://www.instagram.com/");   
               Thread.sleep(2000);
               driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tanvi123");
               Thread.sleep(2000);
               driver.findElement(By.xpath("//input[@name='password']")).sendKeys("t123123n");
               Thread.sleep(2000);
           	driver.findElement(By.xpath("//button[@type='submit']")).click();
                     
	}

}
