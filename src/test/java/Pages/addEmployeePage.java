package Pages;

import Utils.commonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addEmployeePage extends commonMethods {
    @FindBy(id = "menu_pim_addEmployee")
    public static WebElement addEmpBtn;
    @FindBy(id = "menu_pim_addEmployee")
    public static WebElement addEmployeeBtn;

    @FindBy(id = "firstName")
    public static WebElement firstNameTextBox;

    @FindBy(id = "middleName")
    public static WebElement middleNameTextBox;

    @FindBy(id = "lastName")
    public static WebElement lastNameTextBox;

    @FindBy(id = "btnSave")
    public static WebElement saveBtn;


    public addEmployeePage(){

        PageFactory.initElements(driver,this);
    }

}
