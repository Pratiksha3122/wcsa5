package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathUsingContains {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'me')]")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'oxd')]")).click();
		

	}

}
