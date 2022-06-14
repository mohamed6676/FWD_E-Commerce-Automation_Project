@Runner
  Feature: Choosing Categories|| User could choose different categories

    Background: user could login with valid data
      Given user navigate to Home page
      And user click on login
      When user enter valid "test133@gmail.com" and valid "Qwert6613"
      And user clicks login button
      Then user logged in successfully

    Scenario: user could choose different categories
      When user select Computer categories then software subcategory
      And user choose Books categories
      And user select Electronics categories then cell phones subcategory
      And  user choose Gift Cards categories
