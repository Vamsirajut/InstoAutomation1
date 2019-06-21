package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Testbase.Testbase;

public class Homepage {
	
	public WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//li[@class='tabs-personal hasSubNav']/a[@href='/personal/']")
	public WebElement PersonalTab;
	
	
	@FindBy(how = How.XPATH, using = "//span[@class='subNav__content__menu__items__accounts__title']/span[contains(@class,'home-loans')]")
	public WebElement HomeLoanLink;
	
	public Homepage(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}
	
	public void navigateToHomeLoan() {
		PersonalTab.click();
		
		HomeLoanLink.click();
	}
	
	
	

}
