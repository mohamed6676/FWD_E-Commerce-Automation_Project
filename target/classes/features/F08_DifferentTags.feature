@Runner
Feature: Different Tags|| user could select different tags

  Background: user could login with valid data

    Given user navigate to Home page
    And user click on login
    When user enter valid "test133@gmail.com" and valid "Qwert6613"
    And user clicks login button
    Then user logged in successfully

  Scenario: user could select different tags on the site
    Given navigate to digital downloads
    When select cool from popular tags
    And select game from popular tags
    And select computer from popular tags