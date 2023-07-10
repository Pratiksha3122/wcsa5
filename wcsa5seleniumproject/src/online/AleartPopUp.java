package online;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AleartPopUp {

	public static void main(String[] args) {
		
             WebDriver driver= new ChromeDriver();
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
             driver.get("https://demo.actitime.com/login.do");
             driver.manage().window().maximize();
             driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
             driver.findElement(By.xpath("//div[@class='popup_menu_icon'])[2]")).click();
             driver.findElement(By.xpath("//a[.='Types of Work']")).click();
             driver.findElement(By.xpath("//span[text()='Create Types of Work']")).click();
             driver.findElement(By.id("name")).sendKeys("qspiders");
             
	}

}
