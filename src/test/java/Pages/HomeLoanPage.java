package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import HomelncalcStepdefinition.CommonSteps;

public class HomeLoanPage {
	public WebDriver driver;
	
	CommonSteps cs = new CommonSteps();
	
	@FindBy(how = How.XPATH, using = "//span[text()='Calculators and tools']")
	public WebElement CalcAndToolsLink;
	
	
	@FindBy(how = How.XPATH, using = "//a[text()='How much could I borrow']")
	public WebElement HowMchBrwLink;
	
	public HomeLoanPage(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}
	
	public void navigateToBorrowPage() throws InterruptedException {
		cs.nominalWait();
		Actions act = new Actions(driver);
		act.moveToElement(CalcAndToolsLink).build().perform();
		cs.nominalWait();
		HowMchBrwLink.click();
	}
}
