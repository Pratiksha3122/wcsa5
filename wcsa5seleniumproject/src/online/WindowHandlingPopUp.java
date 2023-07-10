package online;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandlingPopUp {

	public static void main(String[] args) {
		 WebDriver driver= new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
         driver.manage().window().maximize();
         driver.get("https://www.naukri.com/");
         WebElement job = driver.findElement(By.xpath("//div[text()='Jobs']"));
         Actions act = new Actions(driver);
         act.moveToElement(job).perform();
        
         driver.findElement(By.xpath("//div[text()='Jobs by skill']")).click();
         driver.findElement(By.xpath("//div[text()='Services']")).click();
         
         String mainId = driver.getWindowHandle();
         System.out.println(mainId);
         
         Set<String> allIds = driver.getWindowHandles();
         System.out.println(allIds);
         
         for(String id:allIds)
         {
        	 if(!mainId.equals(id))
        	 {
        		 driver.switchTo().window(id);
        		 System.out.println(id);
        		 
        		 driver.findElement(By.xpath("//span[text()='FIND JOBS']")).click();
        		 driver.close();
        	 }
         }
         driver.switchTo().window(mainId);
         
         
         
         
	}

}
