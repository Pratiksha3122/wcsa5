package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	    public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//generate aleart popup
		driver.get("file:///C:/Users/User/Desktop/tanvi/alert1.html");
		Thread.sleep(2000);
		//generate alert popup
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		//al.accept
		System.out.println(al.getText());
		al.dismiss();
		
		
		

	}

}
