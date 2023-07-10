package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathLocator2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("http://127.0.0.1/login.do");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Users']/following-sibling::img[@src='/img/default/pixel.gif?hash=1692528820']")).click();
		driver.findElement(By.xpath("//input[@value='Create New User']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("prathu");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='passwordText']")).sendKeys("tanvi123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("tanvi123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("tanvi");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("nikam");
		Thread.sleep(1000);
		driver.findElement(By.xpath(" //input[@type='submit']")).click();
		
	}

}
