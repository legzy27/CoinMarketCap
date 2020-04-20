Feature: Open coinmarketcap.com verify all 100 results displayed

  Scenario: Verify 100 results are displayed on coinmarket
    Given I am coinmarket page
    When I click on view all
    Then I verified 100 results are displayed

    Scenario: Go to coinmarket add 5 and 10 to watchlist and verify options are added
      Given I am coinmarket page
      When I am on the page I select 5 crypto
      Then I click on the Watchlist tab.
      And  I check all options are added

      @smoktest
      Scenario: Go to coinmarket display cryptocurrencies check list and apply filters
        Given I am coinmarket page
        When I click any of the three Full List options on this menu.
        Then I click any options and record data on current page
        Then I apply any combination of filters, displayed in the three dropdown menus above the tabs.
        And I check data record





