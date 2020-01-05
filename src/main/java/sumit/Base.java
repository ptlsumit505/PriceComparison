package sumit;

//import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	//public static Properties prop;
	

	
	public static void initialize(String url) {
		

		System.setProperty("webdriver.chrome.driver", "E:\\lost\\PriceComparison\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		
		
}
}
