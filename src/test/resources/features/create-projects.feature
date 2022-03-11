@screen
@logs
Feature: Project

  Scenario: Login
    Given I open url "https://en.wikipedia.org/wiki/Main_Page"
    When I click the login button
    Then I login with "teovermesan" and "Test123456789"

  Scenario: Check loggedin User
    Then Header name is "Teovermesan"
    And I stop the test
    
  Scenario: Logout
   And I logout