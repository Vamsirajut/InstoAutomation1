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


	/*public static void readConfig() {
		// java class to read input from the file and pass on the values

		// fip = new FileInputStream(System.getProperty("user.dir" +
		// "\\src\\test\\java\\Configuration\\Config.properties"));
		// FileInputStream fip = null;
		// fip = new FileInputStream(
		// System.getProperty("user.dir") +
		// "\\src\\test\\java\\Configuration\\Config.properties");
		FileInputStream fip = null;
		FileInputStream fip1 = null;
		FileInputStream fip2 = null;

		try {
			fip = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\test\\java\\Configuration\\Config.properties");
			fip1 = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\test\\java\\Configuration\\Fast.properties");
			fip2 = new FileInputStream(System.getProperty("user.dir")
					+ "\\src\\test\\java\\Configuration\\OCPHomepagelocators.properties");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		prop = new Properties();
		Locator = new Properties();
		try {
			prop.load(fip);
			Locator.load(fip1);
			Locator.load(fip2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void enterValue(String xpathExpression, String value) {
		try {
			WebElement ele = driver.findElement(By.xpath(xpathExpression));
			waitForObject(ele);
			ele.sendKeys(value);
		} catch (Exception e) {
			System.out.println("Error Message from enter value method: " + e.getLocalizedMessage());
		}

	}

	public static void enterTABAndEnter(String xpathExpression, String value) {
		try {
			WebElement ele = driver.findElement(By.xpath(xpathExpression));
			waitForObject(ele);
			ele.sendKeys(Keys.TAB);
			ele.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			System.out.println("Error Message from enter value method: " + e.getLocalizedMessage());
		}
	}
	
	public static void enterValueAndTabOut(String xpathExpression, String value) {
		try {
			WebElement ele = driver.findElement(By.xpath(xpathExpression));
			waitForObject(ele);
			ele.sendKeys(value);
			nominalWait();
			ele.sendKeys(Keys.TAB);
		} catch (Exception e) {
			System.out.println("Error Message from enter value method: " + e.getLocalizedMessage());
		}

	}

	public static void click(String xpath) throws InterruptedException {
		try {
			WebElement ele = driver.findElement(By.xpath(xpath));
			waitForObject(ele);
			Actions act = new Actions(driver);
			act.moveToElement(ele).build().perform();
			act.click(ele).build().perform();
		} catch (Exception e) {
			System.out.println("Error message from Click method: " + e.getLocalizedMessage());
		}
	}

	public static boolean checkObjExists(String xpathExpression) {
		boolean chk = false;
		try {
			WebElement ele = driver.findElement(By.xpath(xpathExpression));
			waitForObject(ele);
			if (ele.isDisplayed()) {
				chk = true;
			} else {
				chk = false;
			}
		} catch (Exception e) {
			System.out.println("Check Obj Exists Error: " + e.getLocalizedMessage());
		}

		return chk;
	}

	public static String getText(String xpath) {
		WebElement ele = driver.findElement(By.xpath(xpath));
		waitForObject(ele);

		return ele.getText();

	}
	
	

	public static void selectFromDropdown(String xpath, String value) {
		WebElement ele = driver.findElement(By.xpath(xpath));
		waitForObject(ele);

		int indexNum = 0;

		List<WebElement> lstOption = ele.findElements(By.tagName("option"));

		if (lstOption.size() > 0) {
			for (int cnt = 0; cnt < lstOption.size(); cnt++) {
				if (lstOption.get(cnt).getText().equalsIgnoreCase(value)) {
					indexNum = cnt;
					break;
				}
			}
		}

		Select sel = new Select(ele);
		sel.selectByIndex(indexNum);
	}

	// public static void selectdrpdownvale(String xpath, String value) {
	// WebElement value = driver.findElement(By.xpath(xpath));
	// waitForObject(value);
	//
	// int indexNum = 0;
	////
	// Select drpdown = new Select(value);
	//
	//
	//
	// dropdown.selectByIndex(1);

	// List<WebElement> lstOption = ele.findElements(By.tagName("option"));
	//
	// if (lstOption.size() > 0) {
	// for (int cnt = 0; cnt < lstOption.size(); cnt++) {
	// if (lstOption.get(cnt).getText().equalsIgnoreCase(value)) {
	// indexNum = cnt;
	// break;
	// }
	// }
	// }
	//
	// Select sel = new Select(ele);
	// sel.selectByIndex(indexNum);
	// }

	public static String getAttValue(String xpath, String attName) {
		WebElement ele = driver.findElement(By.xpath(xpath));
		waitForObject(ele);

		return ele.getAttribute(attName);
	}

	public static String generateRandomNum() {
		Random rnd = new Random();
		String randNum = Integer.toString((rnd.nextInt((999999 - 100000) + 1) + 100000));
		return randNum;
	}

	public static void waitForObject(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			System.out.println("Error message from wait for object method: " + e.getLocalizedMessage());
		}

	}

	public void ByPixel() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
	}

	public String getLabelForCheckedCheckBoxes() {
		String labelName = null;
		try {
			WebElement gParent = driver.findElement(By.xpath("//div[@class='profilePrint__content']"));
			List<WebElement> lstCheckbox = gParent.findElements(By.tagName("label")); // [@class='checkbox']

			System.out.println("Size of checkboxes: " + lstCheckbox.size());

			for (WebElement ele : lstCheckbox) {

				if (ele.getAttribute("class").equals("checkbox")) {

					if (ele.findElement(By.tagName("input")).isSelected()) {
						List<WebElement> lstOpt = ele.findElements(By.tagName("span"));
						// labelName = labelName + lstOpt.get(2).getText();
						for (int st = 0; st < lstOpt.size(); st++) {
							labelName = labelName + "|" + lstOpt.get(st).getText();
						}

					}

				}

			}
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		return labelName;
	}

	public static void uploadfile(String docPath) {
		// docPath = "C:\\Users\\thotakv1\\Documents\\Draft Message.PNG";

		
		 * String workingDir = System.getProperty("user.dir"); String filepath =
		 * workingDir + "\\SeleniumWebdriverUploadFile.html"; driver.get(filepath);
		 * 
		 * WebElement fileInput = driver.findElement(By.id("uploadfile_0"));
		 * fileInput.sendKeys(filepath);
		 

		driver.findElement(By.xpath(Locator.getProperty("Upload_File"))).sendKeys(docPath);

		// Added sleep to make you see the difference.

		// fileInput.sendKeys(filepath);
	}

	public static String getCurrentDate() {
		Date dte = new Date();
		String CurrDate = new SimpleDateFormat("dd/MM/yyyy").format(dte);
		return CurrDate;
	}

	public String getReportConfigPath() {
		Properties properties = null;
		String reportConfigPath = properties.getProperty("reportConfigPath");
		if (reportConfigPath != null)
			return reportConfigPath;
		else
			throw new RuntimeException(
					"Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
	}

	public static String getDate(int dayCnt) {
		Calendar cal = Calendar.getInstance();

		cal.add(Calendar.DATE, dayCnt);

		Date dte = cal.getTime();
		String CurrDate = new SimpleDateFormat("dd/MM/yyyy").format(dte);
		return CurrDate;

	}

	public static String readPDFData(String pdfPath) throws IOException {
		PdfReader reader = new PdfReader(pdfPath);
		PdfReaderContentParser parser = new PdfReaderContentParser(reader);
		String data = null;
		// PrintWriter out = new PrintWriter(new FileOutputStream(txt));
		TextExtractionStrategy strategy;
		for (int i = 1; i <= reader.getNumberOfPages(); i++) {
			strategy = parser.processContent(i, new SimpleTextExtractionStrategy());
			data = data + "\n" + strategy.getResultantText();
		}
		reader.close();

		return data;

	}*/

	

	public void closeBrowser() {
		driver.quit();
	}

	public static void main(String[] args) throws IOException {
		/*System.out.println(readPDFData(
				"C:\\Users\\thotakv1\\eclipse-workspace\\CucumberOCPAutomation\\src\\test\\java\\Reports\\test1.pdf"));*/

	}

}
