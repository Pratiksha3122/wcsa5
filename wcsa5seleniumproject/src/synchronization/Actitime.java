package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("http://127.0.0.1/login.dor");
		 
			
		 if(driver.getTitle().equals("actiTIME - Login"))
		 {
			 System.out.println("Login page Title is Matched !!,Test Case Passed!!");
			 
			 driver.findElement(By.name("username")).sendKeys("admin");
			 driver.findElement(By.name("pwd")).sendKeys("manager");
			 driver.findElement(By.id("loginButton")).click();
		 }
		 
		 else
		 {
			 System.out.println("Login page Title is not Matched !!,Test Case Failed!!");
		 }
		 
		 
		 if(driver.getTitle().equals("actiTIME - Enter Time-Track"))
		 {
			 System.out.println("Home page Title is Matched !!,Test Case Passed!!");
		 }
		 
		 else
		 {
			 System.out.println("Home page Title is not Matched !!,Test Case Failed!!");
		 }
		 
		

	}

}
