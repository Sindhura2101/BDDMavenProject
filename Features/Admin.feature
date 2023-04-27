Feature:Admin
@simple
Scenario: Login with Valid credentials
	Given user launch chrome
	When User open url "https://admin-demo.nopcommerce.com/login"
	And user enter username "admin@yourstore.com" and password "admin"
	And User click login button
	Then page title "Dashboard / nopCommerce administration"
	And close browser

@Sanity
Scenario Outline: Login Data Driver
	Given user launch chrome
	When User open url "https://admin-demo.nopcommerce.com/login"
	And user enter username "<email>" and password "<password>"
	And User click login button
	Then page title "Dashboard / nopCommerce administration"
	And close browser
	
	Examples:
	|email                |password|
	|admin@yourstore.com  |admin |
	|admin@yourstore.com  |admin1234|
	
	