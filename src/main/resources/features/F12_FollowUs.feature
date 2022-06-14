@Runner
Feature: Follow Us|| user could follow site social accounts

  Background: user could login with valid data
    Given user navigate to Home page
    And user click on login
    When user enter valid "test133@gmail.com" and valid "Qwert6613"
    And user clicks login button
    Then user logged in successfully

  Scenario: User Follow Facebook
    When user click on facebook
    Then navigated to facebook "https://www.facebook.com/nopCommerce"

  Scenario: User Follow Twitter
    When user click on twitter
    Then navigated to twitter "https://twitter.com/nopCommerce"

  Scenario: User Follow rss
    When user click on rss
    Then navigated to rss "https://demo.nopcommerce.com/nopcommerce-new-release"

  Scenario: User Follow youtube
    When user click on youtube
    Then navigated to youtube "https://www.youtube.com/user/nopCommerce"


