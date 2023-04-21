package steps;

import Utils.commonMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends commonMethods {

    @Before
    public void precond(){
        openBrowserAndLaunchApplication();
    }
    @After
    public void postcond(){
        closeBrowser();
    }
}
