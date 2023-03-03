Feature: Web table user order feature


  Scenario: User should be able to place order and order seen in web table
    Given user is already logged in and on order page
    When user selects product type "Familybea"
    And user enters quantity "2"
    And user enters costumer name "Sherlock Holmes"
    And user enters street "221B Baker Street"
    And user enters city "London"
    And user enters state "England"
    And user enters zipcode "50505"
    And user selects credit card type "MasterCard"
    And user enters credit card number "1111222233334444"
    And user enters expiry date "12/23"
    And user enters process order button
    Then user should see "Sherlock Holmes" in first row of the web table

    @Run
  Scenario Outline: User should be able to place order and order seen in web table
    Given user is already logged in and on order page
    And user selects product type "<productType>"
    And user enters quantity "<quantity>"
    And user enters costumer name "<customerName>"
    And user enters street "<street>"
    And user enters city "<city>"
    And user enters state "<state>"
    And user enters zipcode "<zipCode>"
    And user selects credit card type "<cardType>"
    And user enters credit card number "<cardNo>"
    And user enters expiry date "<expDate>"
    And user enters process order button
    And user should see "<expectedName>" in first row of the web table
    Then user can logout

      Examples: Famous Female Scientists
        | productType | quantity | customerName    | street | city | state | zipCode | cardType | cardNo           | expDate | expectedName    | s |
        | Familybea   | 3        | Kemali Ataturk  | cart   | curt | tur   | 12354   | Visa     | 1111222233334444 | 15/25   | Kemal Ataturk   | d |
        | Familybea   | 2        | Baraki Obama    | cart   | curt | tur   | 12354   | Visa     | 1111222233334444 | 17/25   | Barak Obama     | f |
        | Familybea   | 4        | Albert Ainstain | cart   | curt | tur   | 12354   | Visa     | 1111222233334444 | 15/25   | Albert Ainstain | g |

