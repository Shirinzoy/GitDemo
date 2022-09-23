Feature: User Registration

  Scenario: user registration with different Data
    Given User is registation page
    When User enters following user details
    | Naveen | Automation | nav@gmail.com | 99999 | Banglore |
	  | Tom | Peter | tom@gmail.com | 88888 | London |
	  | Lisa | Dsouza | lisa@gmail.com | 77777 | Kabul |
		Then User registration should be successful
		
 Scenario: user registration with different Data with Columns
    Given User is registation page
    When User enters following user details with columns
    
    | firstname | lastname | email | phone | Banglore |
    | Naveen | Automation | nav@gmail.com | 99999 | Banglore |
	  | Tom | Peter | tom@gmail.com | 88888 | London |
	  | Lisa | Dsouza | lisa@gmail.com | 77777 | Kabul |
		Then User registration should be successful