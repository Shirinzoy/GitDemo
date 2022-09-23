Feature: Amazon Search

	@Search
  Scenario: Search a Product
    Given I have a search field on Amazon Page
    When I search for a product with name "Apple MacBook Pro" and price 1000
    Then Product with name "Apple MacBook Pro" should be displayed
    Then Order id is 12345 and user name is "Naveen"
    


