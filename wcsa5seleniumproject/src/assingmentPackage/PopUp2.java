package assingmentPackage;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.actitime.com/login.do");
	    driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
	    driver.findElement(By.xpath("//div[@class='popup_menu_icon'])[2]")).click();
	    driver.findElement(By.xpath("//a[.='Types of Work']")).click();
	    driver.findElement(By.xpath("//span[text()='Create Type of Work'")).click();
	    driver.findElement(By.id("name")).sendKeys("qspiders");
	    driver.findElement(By.xpath("//input[@value='      cancle      ")).click();
	    Alert alt = driver.switchTo().alert();
	    alt.accept();
	 
	}

}
