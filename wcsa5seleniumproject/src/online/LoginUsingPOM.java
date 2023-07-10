package online;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginUsingPOM {

	public LoginUsingPOM (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//decleration
	
	@FindBy(id="username")
	private WebElement userTextField;
	
	@FindBy(name="pwd")
	private WebElement passWordTextField;
	
	@FindBy(id="loginButtonContainer")
	private WebElement loginButton;

	//gettter method
	public WebElement getUserTextFild() {
		return userTextField;
	}

	public WebElement getPasswordTextFild() {
		return passWordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	//bussiness logic
	
	public void loginToApp(String username,String passWord)
	{
		userTextField.sendKeys(username);
		passWordTextField.sendKeys("password");
		loginButton.click();
	}
	
	
	
	
}
