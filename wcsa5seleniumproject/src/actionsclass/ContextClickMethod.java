package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
     	WebDriver driver=new ChromeDriver();
     	driver.manage().window().maximize();
     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     	driver.get("file:///C:/Users/User/Desktop/tanvi/SingleDD.html");
        
     	WebElement target = driver.findElement(By.id("menu"));
     	 
     	// To perform right click
     	   Actions act = new Actions(driver);
     	   Thread.sleep(3000);
     	   act.contextClick(target).perform();
     	
	}
}
