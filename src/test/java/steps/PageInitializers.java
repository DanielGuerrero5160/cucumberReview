package steps;

import Pages.Dashboard;
import Pages.LoginPage;
import Pages.addEmployeePage;

public class PageInitializers {

    public static LoginPage login;

    public static addEmployeePage addEmp;
    public static Dashboard dash;

    public static void initializePageObjects(){

        login=new LoginPage();

        addEmp=new addEmployeePage();

        dash=new Dashboard();

    }

}
