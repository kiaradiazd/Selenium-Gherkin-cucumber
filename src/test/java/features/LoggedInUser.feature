Feature: LoggedIn User View

  @loggedInUser
  Scenario: User successfully enters the log in details
    Given User navigates to the Login page
    When User seccuessfully enters the log indetails
    Then User should be able to view the product category page
