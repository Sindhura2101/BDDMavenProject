Feature:Customer

Scenario Outline: Add new customer
	Given user launch chrome
	When User open url "https://admin-demo.nopcommerce.com/login"
	And user enter username "<email>" and password "<password>"
	And User click login button
	Then page title "Dashboard / nopCommerce administration"
	When User click on Customers menu
	And User click on customers menu item
	And User click on add new button
	Then User can view add new customer page
	When user enter customer info as "<nemail>" and "<npassword>" and "<fname>" and "<lname>" and "<gender>" and "<comName>" and "<adminComment>"
	And User click on save button
	Then User can view confirmation msg "The new customer has been added successfully."
	And close browser
	
	Examples:
	|email                |password|nemail       |npassword|fname |lname|gender|comName|adminComment|
	|admin@yourstore.com  |admin   |c11@abc.com  |abc      |first |last |Male  |abc    |Test1|
