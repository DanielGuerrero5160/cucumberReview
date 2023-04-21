Feature: test the login functionality
  Scenario: validate admin login
    #Given the user navigates to the url
    When user enters a valid email and password
    And clicks on login button
    Then the user is logged in

  Scenario: validate admin login part2
    #Given the user navigates to the url
    When user enters a valid email "Admin" and password "Hum@nhrm123"
    And clicks on login button
    Then the user is logged in

  Scenario: validate admin login part3
    #Given the user navigates to the url
    When user enters a valid email "Admi2n" and password "honk"
    And clicks on login button
    Then the user is logged in


@expected
Scenario Outline: Validate the wrong credentials error message
  When user enters the "<username>" and "<password>"
  And clicks on login button
  Then user sees a message "<errorMsg>"
  Examples:
  | username  | password  | errorMsg|
  | adminx     | Hum@nhrm123    | Invalid credentials   |
  |      |                         | Username cannot be empty  |
  |       | cadabra              | Username cannot be empty  |

