package online;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
		driver.findElement(By.xpath("//button[.='click']")).click();

		Set<String> allIds = driver.getWindowHandles();
		for(String win:allIds)
		{
			driver.switchTo().window(win);
			String pageTitle = driver.getTitle();
			System.out.println(pageTitle);
			if(pageTitle.contains("selenium"))
			{
				break;
			}
		}
		driver.findElement(By.xpath("//a[text()='Watch the Videos']")).click();
		/*Set<String> allIds1 = driver.getWindowHandles();
		for(String win:allIds1)
		{
			driver.switchTo().window(win);
			String pageTitle = driver.getTitle();
			System.out.println(pageTitle);
			if(pageTitle.contains("Frames & windows"))
			{
				break;
			}
		}*/
		
	}

}
