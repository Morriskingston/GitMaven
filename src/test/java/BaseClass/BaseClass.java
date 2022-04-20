package BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static WebDriver launchBrowser(String browserName) {
		if(browserName.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		else if(browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else if(browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		return driver;
	}
	
	public static void launchurl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public static void implicitywait() {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public static void threadsleep(int time) throws InterruptedException {
	
		Thread.sleep(time);
		
	}
	
	public static String gettittle() {
		String tittle = driver.getCurrentUrl();
		return tittle;
	}
	
	public static String getcurrenturl() {
		
		String currenturl = driver.getCurrentUrl();
		return currenturl;
	}
	
	public static void quit() {
		driver.quit();
	}
	
	public static void close() {
		driver.quit();
	}
	
	//---------------------------------------------------------------------------------------------------------------------
	
	
	public static void click(WebElement w) {
		w.click();
	}
	
	public static void clear(WebElement w) {
		w.clear();
	}
	
	public static String getText(WebElement w) {
		String text = w.getText();
		return text;
	}
	
	public static String getAttribute(WebElement w) {
		String attribute = w.getAttribute("value");
		return attribute;
	}
	
	
	
	
	
	

}
