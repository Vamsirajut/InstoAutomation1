@SmokeTest 
Feature: Home loan borrowing capacity 

Scenario: Verify the home loan borrowing capacity using  home loan calculator 

	Given User selects personal details 
	And   User enters his earnings 
	And   User enters his expenses 
	Then  Click on Work out how much I could borrow 
	And   User clicks on start over 
	Then  Form gets cleared with default values 
	Then  Close Browser 
	
	
Scenario: Verify message is displayed to call customercare when entering one dollar as living expenses 

	Given User selects personal details 
	And   User enters one dollar as expense
	Then  Click on Work out how much I could borrow 
	And   User gets message to call the customer care number
	Then  Close Browser