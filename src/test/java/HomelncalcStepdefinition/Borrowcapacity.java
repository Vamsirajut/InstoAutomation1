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

	/*
	 * public String razorId; public String cgName;
	 * 
	 * public static HashMap<String, String> dataMap = new HashMap<String,
	 * String>(); public String SubmissionTitle = "AUTOMATIONSubtitle";
	 * 
	 * CreatenewSubmission createNewProfileCcv;
	 */
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

			hmLoan.navigateToBorrowPage();

			if (bPage.getApplicationType().equalsIgnoreCase(("Single"))) {
				System.out.println("Single is selected");
			}else {
				System.out.println("Joint is selected");
			}
			
			if (bPage.getApplicationType().equalsIgnoreCase("HometoLive")) {
				System.out.println("HometoLive is selected");
			}else {
				System.out.println("Residnetial Investment is selected");
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
	
	@Then("^Close Browser$")
	public void closeBrowserForExp() {
		closeBrowser();
	}

}
