@ForSearchFeature
Feature: Search valid product and Add into Basket
  
  As a user
  I want to see the Product
  So that I can add into Basket

  @ForSearchScenario
  Scenario Outline: Verify that the product is available into basket
    Given the Runmode is "<Runmode>"
    When I navigate to "testUrl" on "browserType"
    And I enter "<searchLocation>" into "searchLocationText"
    And I click on "searchButton"
    And check outcomes "headerTitleLabel"
    And I click on "productname"
    And check "logo"
    And I click on "addbasketbutton"
    And check Page "icon"
    And I click on "viewbasket"
    Then the added product for result page "finalLable" should show "<Expected>"

    Examples: 
      | Runmode | searchLocation | Expected |
      | Y       | Battery        |        1 |
