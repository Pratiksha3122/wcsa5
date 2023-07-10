package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDICase4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.flipkart.com/");
	      Thread.sleep(2000);                                                       
	      driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//input[@name='q']")).sendKeys("hp laptop");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//button[@type='submit']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//div[text()='Brand']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//div[text()='HP']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//div[text()='Core i5']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//div[text()='Operating System']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//div[text()='Windows 11']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//div[text()='HP Victus Core i5 11th Gen - (8 GB/512 GB SSD/Windows 11 Home/4 GB Graphics/NVIDIA GeForce GTX 1650) 1...']/../..//div[text()='₹58,990']")).click();
	    
    }
}