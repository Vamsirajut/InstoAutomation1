package Testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfReaderContentParser;
import com.itextpdf.text.pdf.parser.SimpleTextExtractionStrategy;
import com.itextpdf.text.pdf.parser.TextExtractionStrategy;

public class Testbase {

	public WebDriver driver = null;
	public static Properties prop = null;
	public static Properties Locator = null;

	
	//Driver Initialization  and navigate url
	public Testbase() {
		startBrowser();
		
	}

	public void startBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thotakv1\\eclipse-workspace\\AnzCucumberAutomation\\src\\test\\java\\Drivers\\chromedriver.exe");

		 ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);

		 driver = new ChromeDriver(options);
		 //driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(45000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	public void navigateUrl() {
	
		driver.get("https://www.anz.com.au/personal/");
	}


	

	

	public void closeBrowser() {
		driver.quit();
	}

	

}
