package steps;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.loginpage;

public class loginSteps {
    Hooks x=new Hooks();
    @BeforeTest
    public void openbrowser(){
        x.openBrowser();
    }

    @Test
    public void Test1() throws InterruptedException {
        loginpage login=new loginpage();
        //Click on login/Signup Button
        login.signuploginButton().click();
        //Enter Email
        login.emailfield().sendKeys("adham228@gmail.com");
        //Enter password
        login.passwordfield().sendKeys("A2282003");
        //Click on login Button
        login.loginButton().click();

    }


    @AfterTest
    public void closebrowser() throws InterruptedException {
        x.quit();
    }







}
