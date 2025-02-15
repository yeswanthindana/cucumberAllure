Feature: General view

  Scenario: Validate general user is able to view without logging in
    Given User navigates to the Online Products page
    When User clicks on the Formal shoes dropdown
    Then User should be able to view the products