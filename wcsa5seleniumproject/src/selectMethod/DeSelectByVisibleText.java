package selectMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectByVisibleText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///C:/Users/User/Desktop/tanvi/Mdropdown.html");

		// to identify dropdown 

		WebElement dropDown = driver.findElement(By.name("menu"));
		
		// to select the option
		
		Select sel = new Select(dropDown);
		
		sel.selectByVisibleText("maggi");
		Thread.sleep(2000);
		sel.selectByVisibleText("Poha");
		
		
		// Deslect the options
		
		Thread.sleep(2000);
		sel.deselectByVisibleText("Poha");
		Thread.sleep(2000);
		sel.deselectByVisibleText("maggi");

	}
}
