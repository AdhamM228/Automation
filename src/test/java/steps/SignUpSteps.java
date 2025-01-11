package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Adham;


public class SignUpSteps {
//    Hooks x = new Hooks();
//
//
//    @BeforeTest
//    public void openbrowser() {
//        x.openBrowser();
//    }
//
//    @Test
//    public void Test1() throws InterruptedException {
//        Adham signUp = new Adham();
//        //Click on login/Signup Button
//        signUp.SignUpButton().click();
//        //Enter name
//        signUp.namefield().sendKeys("Adham Mohamed");
//        //Enter Email
//        signUp.emailfield().sendKeys("adham2283@gmail.com");
//        //Click on login Button
//        signUp.signupbutton().click();
//        //choose male
//        signUp.male().click();
//        //Enter password
//        signUp.passwordfield().sendKeys("A228#2003");
//        //select day
//        Select day = new Select(signUp.day());
//        day.selectByVisibleText("22");
//        //select month
//        Select month = new Select(signUp.month());
//        month.selectByVisibleText("August");
//        //select year
//        Select year = new Select(signUp.year());
//        year.selectByVisibleText("2003");
//        //choose option
//        signUp.option().click();
//        //Enter firstname
//        signUp.Firstnamefield().sendKeys("Adham");
//        //Enter lastname
//        signUp.Lastnamefield().sendKeys("Mohamed");
//        //Enter address
//        signUp.Addressfield().sendKeys("10TH of Ramadan");
//        //select country
//        Select select = new Select(signUp.coountry());
//        select.selectByVisibleText("Canada");
//        //Enter state
//        signUp.statefield().sendKeys("Egypt");
//        //Enter city
//        signUp.cityfield().sendKeys("10TH of Ramadan");
//        //Enter zipcode
//        signUp.zipcodefield().sendKeys("5432");
//        //Enter mobilenumber
//        signUp.mobilenumberfield().sendKeys("01045137649");
//        //Click on createaccount Button
//        signUp.createaccountButton().click();
//    }
//
//        @AfterTest
//        public void closebrowser () throws InterruptedException {
//            x.quit();
//        }
    Adham signup=new Adham();
    @Given("user click on login signup button")
    public void user_click_on_login_signup_button() throws InterruptedException {
      signup.SignUpButton().click();
    }

    @When("user Enter name")
    public void user_Enter_name() throws InterruptedException {
        signup.namefield().sendKeys("Adham");
    }

    @And("user Enter Email")
    public void user_Enter_Email() throws InterruptedException {
        signup.emailfield().sendKeys("ADHAM14r@gmail.com");
    }

    @And("user click on signup button")
    public void user_click_on_signup_button() throws InterruptedException {
        signup.signupbutton().click();
    }

    @When("user Enter password")
    public void user_Enter_password() throws InterruptedException {
        signup.passwordfield().sendKeys("A2282003");
    }

    @And("user Enter First name")
    public void user_Enter_First_name() throws InterruptedException {
        signup.Firstnamefield().sendKeys("Adham");
    }

    @And("user Enter Last name")
    public void user_Enter_Last_name() throws InterruptedException {
        signup.Lastnamefield().sendKeys("Mohamed");
    }

    @And("user Enter Address")
    public void user_Enter_Address() throws InterruptedException {
        signup.Addressfield().sendKeys("10TH of Ramadan");
    }

    @And("user select country")
    public void user_select_country() throws InterruptedException {
        Select select = new Select(signup.coountry());
        select.selectByVisibleText("Canada");
    }

    @And("user Enter State")
    public void user_Enter_State() throws InterruptedException {
        signup.statefield().sendKeys("Egypt");
    }

    @And("user Enter City")
    public void user_Enter_City() throws InterruptedException {
        signup.cityfield().sendKeys("10TH of Ramadan");
    }

    @And("user Enter zipcode")
    public void user_Enter_zipcode() throws InterruptedException {
        signup.zipcodefield().sendKeys("2283");
    }

    @And("user Enter Mobile Number")
    public void user_Enter_Mobile_Number() throws InterruptedException {
        signup.mobilenumberfield().sendKeys("01017276743");
    }

    @And("user click on Create Account button")
    public void user_click_on_Create_Account_button() throws InterruptedException {
        signup.createaccountButton().click();
    }

    @Then("user can signup successfully")
    public void user_can_signup_successfully() throws InterruptedException {
        Thread.sleep(2000);
        String ExpectedResult="https://automationexercise.com/account_created";
        String ActualResult=Hooks.driver.getCurrentUrl();
        Assert.assertEquals(ActualResult,ExpectedResult);
}




//invalid
@And("user Enter Email {string}")
public void user_Enter_Email1(String Email) throws InterruptedException {
    signup.emailfield().sendKeys(Email);
}
@And("user Enter first name {string}")
public void user_Enter_First_name1(String FristName) throws InterruptedException {
    signup.Firstnamefield().sendKeys(FristName);
}

    @And("user Enter last name {string}")
    public void user_Enter_Last_name1(String LastName) throws InterruptedException {
        signup.Lastnamefield().sendKeys(LastName);
    }

    @And("user Enter Address {string}")
    public void user_Enter_Address1(String Address) throws InterruptedException {
        signup.Addressfield().sendKeys(Address);
    }

    @And("user select {string}")
    public void user_select_country1(String country) throws InterruptedException {
        Select select = new Select(signup.coountry());
        select.selectByVisibleText(country);
    }


}
