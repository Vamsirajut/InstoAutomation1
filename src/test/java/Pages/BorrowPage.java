package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import HomelncalcStepdefinition.CommonSteps;

public class BorrowPage {
	public WebDriver driver;

	CommonSteps cs = new CommonSteps();

	@FindBy(how = How.XPATH, using = "//span[text()='Calculators and tools']")
	public WebElement AppType;

	@FindBy(how = How.XPATH, using = "//select[@title='Number of dependants']")
	public WebElement Applicationtype;

	@FindBy(how = How.XPATH, using = "//select[@title='Number of dependants']")
	public WebElement NumOfDependent;

	@FindBy(how = How.XPATH, using = "//select[@title='Number of dependants']")
	public WebElement propertytobuy;

	@FindBy(how = How.XPATH, using = "//a[text()='How much could I borrow']")
	public WebElement PropToBuy;

	@FindBy(how = How.XPATH, using = "//input[@aria-labelledby=\"q2q1\"]")
	public WebElement YourIncome;

	@FindBy(how = How.XPATH, using = "//input[@aria-labelledby=\"q2q2\"]")
	public WebElement OtherIncome;

	@FindBy(how = How.XPATH, using = "//input[@id=\"expenses\"]")
	public WebElement LivingExp;

	@FindBy(how = How.XPATH, using = "//input[@id=\"homeloans\"]")
	public WebElement CurrentHLRepay;

	@FindBy(how = How.XPATH, using = "//input[@id=\"otherloans\"]")
	public WebElement OtherLoanRepay;

	@FindBy(how = How.XPATH, using = "//input[@aria-labelledby=\"q3q4\"]")
	public WebElement OtherCommittment;

	@FindBy(how = How.XPATH, using = "//input[@id=\"credit\"]")
	public WebElement TotalCreditCardLimit;

	@FindBy(how = How.XPATH, using = "//button[text()='Work out how much I could borrow']")
	public WebElement wrkouthowmchtobrrow;

	@FindBy(how = How.XPATH, using = "//span[@class=\"borrow__result__text__amount\"]")
	public WebElement calculatedAmnt;

	@FindBy(how = How.XPATH, using = "(//div/button[text()='Start over'])[1]")
	public WebElement startover;

	@FindBy(how = How.XPATH, using = "//span[@class=\"borrow__result__text__amount\"]")
	public WebElement Onedollarexpenseerr;

	public BorrowPage(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}

	public String getApplicationType() throws InterruptedException {
		cs.nominalWait();

		String str = null;

		String xpath = "(//ul[@class=\"borrow__question__answer clearfix\"])[1]/li";

		List<WebElement> eleLst = driver.findElements(By.xpath(xpath));

		if (eleLst.size() > 0) {
			if (eleLst.get(0).getAttribute("class") == null) {
				str = "Joint";
			} else {
				str = "Single";
			}
		}

		return str;
	}

	public String getPropertyToBuy() throws InterruptedException {
		cs.nominalWait();

		String str = null;

		String xpath = "(//ul[@class=\"borrow__question__answer clearfix\"])[2]/li";

		List<WebElement> eleLst = driver.findElements(By.xpath(xpath));

		if (eleLst.size() > 0) {
			if (eleLst.get(0).getAttribute("class") == null) {
				str = "HometoLive";
			} else {
				str = "ResidentialInvestment";
			}
		}

		return str;
	}

	public void enterEarningDetails() throws InterruptedException {
		cs.nominalWait();

		YourIncome.sendKeys("80000");

		OtherIncome.sendKeys("10000");

	}

	public void enterOneDollar() throws InterruptedException {
		cs.nominalWait();

		LivingExp.sendKeys("1");
	}

	public void enterOneDollarerror() throws InterruptedException {
		cs.nominalWait();

		if (Onedollarexpenseerr.getText().contains("Based on the details you've entered, we're unable to give you an estimate of your borrowing power with this calculator. For questions, call us on ")) {
			System.out.println("warning message is displayed");
		} else {
			System.out.println("warning message is not displayed");
		}

	}

	public void enterExpenses() throws InterruptedException {
		cs.nominalWait();

		LivingExp.sendKeys("500");

		CurrentHLRepay.sendKeys("0");

		OtherLoanRepay.sendKeys("100");

		OtherCommittment.sendKeys("0");

		TotalCreditCardLimit.sendKeys("10000");
	}

	public void calculateLoanAmtANdVerify() throws InterruptedException {
		cs.nominalWait();

		wrkouthowmchtobrrow.click();

		cs.nominalWait();

		if (calculatedAmnt.getText().contains("467,000")) {
			System.out.println("Loan Amount is calculated as: 467,000");
		} else {
			System.out.println("Loan Amount is not calculated correctly.");
		}

	}

	public void verifyDefaultValues() {
		if (YourIncome.getText().equals("")) {

		}

		if (OtherIncome.getText().equals("")) {

		}

		if (LivingExp.getText().equals("")) {

		}

		if (CurrentHLRepay.getText().equals("")) {

		}

		if (OtherLoanRepay.getText().equals("")) {

		}

		if (OtherCommittment.getText().equals("")) {

		}

		if (TotalCreditCardLimit.getText().equals("")) {

		}

	}

	public void startover() throws InterruptedException {
		cs.nominalWait();

		startover.click();
	}

}
