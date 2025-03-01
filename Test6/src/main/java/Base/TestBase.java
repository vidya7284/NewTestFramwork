package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public	static	WebDriver	driver;
	public	static	Properties	prop;
	
	
	public	TestBase()	throws	IOException
	{
		FileInputStream	ip	=	new	FileInputStream("E:\\EclipseWS\\Test5\\src\\main\\java\\Config\\Configuration.properties");
		prop.load(ip);
	}
	
	public	static	void	initalization()
	{
		String	browserName	=	prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
            WebDriverManager.chromedriver().setup();
//			System.setProperty("webdriver.chrome.driver",	"chromedriver");
			driver	=	new	ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
	}

}
