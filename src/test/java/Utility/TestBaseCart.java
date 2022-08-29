package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBaseCart {

	public static WebDriver driver;
	public static Properties Propper;

	public TestBaseCart() { // Constructor
		Propper = new Properties();
		
		try {
			FileInputStream files = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\test\\java\\Configaration\\cart.properties");

			Propper.load(files);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void open() {

		String bName = Propper.getProperty("Browser");
		if (bName.equals("Chrome")) {

			System.setProperty("webdriver.chrome.driver","\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(utilityCart.implicitly_Wait, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(utilityCart.pageLoadTime_out, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}

		else if (bName.equals("IE"));
	}

	public static void getURL(String URL) {

		driver.get(Propper.getProperty("URL"));
	
	}
}
