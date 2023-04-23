package steps;

import Utils.ExcelReader;
import Utils.commonMethods;
import Utils.constants;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class addEmployeeSteps extends commonMethods {


    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
doClick(dash.PIMOption);
    }
    @When("user clicks on Add Employee button")
    public void user_clicks_on_add_employee_button() {
doClick(addEmp.addEmpBtn);

}

    @When("user starts adding the employee")
    public void user_starts_adding_the_employee(DataTable dataTable) {

    List<Map<String,String>> employeeNames =dataTable.asMaps();
    for(Map<String,String> employee:employeeNames){
     String fName=employee.get("firstname");
     String mName=employee.get("middlename");
     String lName=employee.get("lastname");

     sendText(addEmp.firstNameTextBox,fName);
     sendText(addEmp.middleNameTextBox,mName);
     sendText(addEmp.lastNameTextBox,lName);


     doClick(addEmp.saveBtn);
     doClick(addEmp.addEmployeeBtn);
    }
    }

    @When("user adds multiple employees from excel using {string} and verify it")
    public void user_adds_multiple_employees_from_excel_using_and_verify_it(String sheetName) throws InterruptedException {
        List<Map<String,String>> empFromExcelReader= ExcelReader.excelListIntoMap(constants.TESTDATA_FILEPATH,sheetName);
        for(Map<String,String> employee:empFromExcelReader) {
            String fName = employee.get("firstName");
            String mName = employee.get("middleName");
            String lName = employee.get("lastName");

            sendText(addEmp.firstNameTextBox,fName);
            sendText(addEmp.middleNameTextBox,mName);
            sendText(addEmp.lastNameTextBox,lName);

            doClick(addEmp.saveBtn);
            doClick(addEmp.addEmployeeBtn);
        }
    }
}
