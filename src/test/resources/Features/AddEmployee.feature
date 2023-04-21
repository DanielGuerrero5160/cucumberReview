Feature: Add employee

  Background:
    #Given the user navigates to the url
    When user enters a valid email "Admin" and password "Hum@nhrm123"
    And clicks on login button
    Then the user is logged in
    When user clicks on PIM option
    And user clicks on Add Employee button

    @datatable @addEmployee
    Scenario: Adding multiple employee in the dataBase
      When user starts adding the employee
      |firstname|middlename|lastname|
      | abra | ca   | dabra |
      | leo  | ne  | messi |


      @excel
      Scenario: Adding multiple employees using excel file
        When user adds multiple employees from excel using "EmployeeData" and verify it