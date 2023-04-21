package Pages;

import Utils.commonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard extends commonMethods {

    public Dashboard(){
        PageFactory.initElements(driver,this);
    }

    @FindBy (id = "menu_pim_viewPimModule")
    public static WebElement PIMOption;

    @FindBy(xpath = "//a[@id='welcome']")
    public static WebElement welcomeMessage;


}
