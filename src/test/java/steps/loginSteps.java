package steps;

import Utils.commonMethods;
import Utils.configReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class loginSteps extends commonMethods {

    @Given("the user navigates to the url")
    public void the_user_navigates_to_the_url() {
openBrowserAndLaunchApplication();
    }
    @When("user enters a valid email and password")
    public void user_enters_a_valid_email_and_password() {
       // WebElement usernameTextBox = driver.findElement(By.id("txtUsername"));
       // WebElement passwordTextBox = driver.findElement(By.id("txtPassword"));
        sendText(login.usernameTextBox, configReader.getPropertyValue("username"));
        sendText(login.passwordTextBox,configReader.getPropertyValue("password"));
    }
    @When("clicks on login button")
    public void clicks_on_login_button() {
//WebElement loginBtn=driver.findElement(By.id("btnLogin"));
doClick(login.loginBtn);
    }
    @Then("the user is logged in")
    public void the_user_is_logged_in() {
//assertion that you are logged in
        String expectedMsg="Welcome Admin";
        String actualMsg=dash.welcomeMessage.getText();
        Assert.assertEquals(expectedMsg,actualMsg);
    }
    @When("user enters a valid email {string} and password {string}")
    public void user_enters_a_valid_email_and_password(String username, String password) {
        //WebElement usernameTextBox = driver.findElement(By.id("txtUsername"));
       // WebElement passwordTextBox = driver.findElement(By.id("txtPassword"));
        sendText(login.usernameTextBox,username);
        sendText(login.passwordTextBox,password);
    }
    @When("user enters the {string} and {string}")
    public void user_enters_the_and(String username, String password) {
        sendText(login.usernameTextBox, username);
        sendText(login.passwordTextBox,password);
    }
    @Then("user sees a message {string}")
    public void user_sees_a_message(String expectedErrorMsg) {
        String errorTxt=login.errorMessage.getText();
        Assert.assertEquals(expectedErrorMsg,errorTxt);
    }

}
