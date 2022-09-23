Feature: Login Feature

Scenario Outline: Login fail -possible combinations
	Given user is on Application landing page
	When user clicks on Sign in button
	Then user is displayed login screen
	When user enters "<UserName>" in username field
	And user enters "<Password>" in password field
	And user clicks Sign in button
	Then user gets login failed error message

		# we can not use "Examples" with normal scenarios	
		# here the "UserName" and "Password" plays thr role of column	
		Examples:
			| UserName					| Password					|
			| incorrectusername | 123456						|
			| naveenautomation	| incorrectpassword	|
			| incorrectusername	| incorrectpassword	|
