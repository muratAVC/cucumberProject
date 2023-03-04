Feature: XFleet user  Feature


  Scenario Outline:I should be able to log in as a user and check my information
    Given users should be able to login with their "<username>" and "<password>"
    And enpty username and password
    And forgot password clickable
    And User can see Remember Me link exists and is clickable on the login page


    Examples: username  and Password
      | username | password    |
      | user45   | UserUser123 |
      | user1    | UserUser123 |
      | user2    | UserUser123 |
      | user3    | UserUser123 |
      | user4    | UserUser123 |

  @XFleet
    Scenario Outline: Invalid username login
      Given invalid login user name "<invalidUserName>"
      And invalid login password "<invalidPassword>"
      And user clicks to login button in zfleet
      And verify  not login
      Examples:
        | invalidUserName | invalidPassword |
        | KemalAtaturk    | UserUser123     |
        | _user45         | UserUser123     |
        | 45user45        | UserUser123     |
        | /user45/        | UserUser123     |


