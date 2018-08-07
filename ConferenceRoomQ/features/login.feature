
Feature: Login
  to login to a site

  @execute
  Scenario: Logging into a site
    Given I have the login page
    When I have correct username and password
    Then login to the site


 

