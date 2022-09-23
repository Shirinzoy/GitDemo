Feature: Uber Booking Feature

@Smoke
  Scenario: Booking Car Sedan
    Given User wants to select a car type "sedan" from uber app
    When User selects car "sedan" and pick up point "Bangalore" and drop location "Pune"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1000 USD
   
@Regression
  Scenario: Booking Car SUV
    Given User wants to select a car type "suv" from uber app
    When User selects car "suv" and pick up point "Bangalore" and drop location "Hyderabad"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1000 USD
    
 @Prod
  Scenario: Booking Car Mini
    Given User wants to select a car type "mini" from uber app
    When User selects car "mini" and pick up point "Bangalore" and drop location "Mumbai"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1000 USD
