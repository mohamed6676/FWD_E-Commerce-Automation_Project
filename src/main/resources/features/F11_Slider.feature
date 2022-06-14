@Runner
Feature: Slider|| user could click on page sliders

  Background: user could login with valid data
    Given user navigate to Home page
    And user click on login
    When user enter valid "test133@gmail.com" and valid "Qwert6613"
    And user clicks login button
    Then user logged in successfully

  Scenario: user could click on page sliders
    When user click on buton_one and click on slider_one
    And should navigated to the slider_product_one page
    When user click on buton_two and click on slider_two
    And  should navigated to the slider_product_two page
