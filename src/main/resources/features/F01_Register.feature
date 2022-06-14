@Runner
Feature: Registeration|| user could register to the site

Scenario: user could register entering valid data

    And user navigate to home page
    And user click register
    When user fills gender"male" fname"Nada" lname"Magdi" day"10" month"9" year"1998" email"test19@gmail.com" valid data
    And user fills valid password "Qwert6613" confirm "Qwert6613"
    And user clicks register button
    Then success message is displayed