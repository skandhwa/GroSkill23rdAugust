@unit

Feature: Add  details to Application

  Scenario: Adding details to form
    Given user opens the demo site of the application
    And user enters the below details
      | firstName | lastName | Address | EmailAddress    | Phone    |
      | Saurabh   | Kandhway | Delhi   | sk123@gmail.com | 98007654 |
      
      
     Then user is going to raise defects 
