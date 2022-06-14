@Runner
  Feature: Filter with Color|| User could filter with color
    Background: user could login with valid data

      Given user navigate to Home page
      And user click on login
      When user enter valid "test133@gmail.com" and valid "Qwert6613"
      And user clicks login button
      Then user logged in successfully


    Scenario: user could filter with color
      And user select shoes from apparel
      And filter by Red color
