Feature: Uber Booking Feature

  Scenario: Booking Car
    Given User wants to select a car type "sedan" from uber app
    When User selects car "sedan" and pick up point "Bangalore" and drop location "Pune"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1000 USD
   
   

    
    
    