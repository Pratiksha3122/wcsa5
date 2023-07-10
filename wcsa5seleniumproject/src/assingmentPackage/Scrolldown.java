package assingmentPackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.amazon.in/");
		
	JavascriptExecutor js = (JavascriptExecutor)driver;
	for(int i=0; i<3; i++)
	{
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		
	}
	}

}
