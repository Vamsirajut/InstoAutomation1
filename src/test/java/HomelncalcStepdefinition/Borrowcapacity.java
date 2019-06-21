package HomelncalcStepdefinition;

import java.util.HashMap;

import org.junit.Assert;

import com.itextpdf.text.log.SysoCounter;

import Pages.BorrowPage;
import Pages.HomeLoanPage;
import Pages.Homepage;
import Testbase.Testbase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Borrowcapacity extends Testbase {

	//HomelncalcFeatures > Borrowcapacity - Feature file
	//HomelncalcStepdefinition > Borrowcapacity - Feature file
	//Test base - Driver initialization and start the browser
	//Refer Home page,Home loan page and Borrow page java class for each individual page objects and their reference to step definition file
	//Go to Runner >Test runner  and right click as Junit test which will give the Junit report kind of  feature wise with time (secs)
	//Testrunner has the reference of feature file,step definition and html report.
	//Report of the same can found under Target/Cucumberreports/index.html
	
	//Questions
	//Q1 :Combination of Joint application type  ,dependants,resendential investment with earnings and expenses and also check if there is other dependencies to this
	//sceanrios examples:
	// |single|1 dependant|Home to live in|earnings|expenses
	//|single|2 dependant|Home to live in|earnings|expenses
	// |single|1 dependant|Reseidential invest|earnings|expenses
	//|single|2 dependant|Reseidential invest|earnings|expenses
	//Joint|1 dependant|Home to live in|earnings|expenses
	//Joint|2 dependant|Home to live in|earnings|expenses
	//Joint|1 dependant|Reseidential invest|earnings|expenses
	//Joint|2 dependant|Reseidential invest|earnings|expenses
	
	//Q2:part of larger test ,implement parameterization and data driven tests with parallel execution
	
	//Q3:Add wait time till the page loads and objece can identified which is already implemented.
		
	
	CommonSteps cs = new CommonSteps();
	Homepage hmPage = new Homepage(driver);

	HomeLoanPage hmLoan = new HomeLoanPage(driver);

	BorrowPage bPage = new BorrowPage(driver);

	@Given("^User selects personal details$")
	public void user_selects_personal_details() throws Throwable {

		// startBrowser();
		navigateUrl();

		try {
			cs.nominalWait();
			hmPage.navigateToHomeLoan();
			System.out.println("Navigated to Home loan");

			hmLoan.navigateToBorrowPage();
			System.out.println("Navigated to Borrow page from Home loan");

			if (bPage.getApplicationType().equalsIgnoreCase(("Single"))) {
				System.out.println("Single is selected in Calculator page");
			}else {
				System.out.println("Joint is selected in Calculator page");
			}
			
			if (bPage.getApplicationType().equalsIgnoreCase("HometoLive")) {
				System.out.println("HometoLive is selected in Calculator page");
			}else {
				System.out.println("Residnetial Investment is selected in Calculator page");
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	
	@And("^User enters his earnings$")
	public void enter_earnings() throws Throwable {

		bPage.enterEarningDetails();
		System.out.println("User Enters his earnings details ");

	}
	
	@And("^User enters his expenses$")
	public void enter_expenses() throws Throwable {

		bPage.enterExpenses();
		System.out.println("User Enters his expenses details ");
	}
	
	@Then("^Click on Work out how much I could borrow$")
	public void calculateLoanAndVerify() throws Throwable {

		bPage.calculateLoanAmtANdVerify();
		System.out.println("User Clicks on Work out how much I could borrow to get the Estimate ");
	}
	
	@And("^User clicks on start over$")
	public void start_over() throws Throwable {

		bPage.startover();
		
		System.out.println("User Clicks on start over ");
	}
	
	@Then("^Form gets cleared with default values$")
	public void Form_gets_cleared_with_default_values() throws Throwable {
		
		bPage.verifyDefaultValues();
		
		System.out.println("Earnings and expenses values are cleared with default values");
	}
	
	@And("^User enters one dollar as expense$")
	public void User_enters_one_dollar_as_expense() throws Throwable {
		
		bPage.enterOneDollar();
		System.out.println("One dollar is entered as expense");
	}
	
	@And("^User gets message to call the customer care number$")
	public void User_gets_message_to_call_the_customer_care_number() throws Throwable {
		
		bPage.enterOneDollarmessage();
		
	}
	
	
	
	@Then("^Close Browser$")
	public void closeBrowserForExp() {
		closeBrowser();
	}

}
