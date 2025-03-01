package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase {

	//Object	Repository
	@FindBy(xpath="//input[@id='userid']") private	WebElement	userIDTextbox;
	@FindBy(xpath="//input[@id='password']") private WebElement	passwordTextbox;
	@FindBy(xpath="//button[@type='submit']") private WebElement loginBtn;
	
	public	LoginPage()	throws	IOException	
	{
		super();
		PageFactory.initElements(driver,this);
	}
	
	public void	validateLoginPageTitle()
	{
		driver.getTitle();
	}
	
	public void	validateLabel()
	{
		driver.getTitle();
	}
	
	public void	validateLogo()
	{
		driver.getTitle();
	}


}
