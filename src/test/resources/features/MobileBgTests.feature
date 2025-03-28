Feature: Mobile Bg tests

  Scenario: Finding Volkswagen Golfs on sale on mobile
    Given I navigate to "mobile.bg" page
    When I click on "Търсене" tab
      And "search" page is open
      And I select "VW" from "Марка" dropdown
      And I select "Golf" from "Модел" dropdown
      And I mark element "4x4" by clicking on it
      And I click on "Търси" button
      And "vw" page is open
    Then I log and print on the console all the Volkswagen Golfs with four wheel drive for sale on mobile.bg