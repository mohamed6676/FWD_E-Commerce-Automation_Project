@Runner
Feature: WishList|| user could add products to the wishlist

  Background: user could login with valid data
    Given user navigate to Home page
#    And user click on login
#    When user enter valid "test133@gmail.com" and valid "Qwert6613"
#    And user clicks login button
#    Then user logged in successfully

  Scenario: user could add products to wishlist
    When click on HTC_One_M8_Android
    And add HTC_One_M8_Android to wishlist
    Then success message appears__1
    When click on Portable_Sound_Speakers
    And add Portable_Sound_Speakers to wishlist
    Then success message appears__2
    When go to digital_downloads
    And click on Science_and_Faith
    And fill mandatory field
    And click on add_to_wishlist
    Then success message appears__3