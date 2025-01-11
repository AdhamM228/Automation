package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import steps.Hooks;

public class Adham {

    public WebDriver driver = Hooks.driver;

    public WebElement SignUpButton() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//a[@href=\"/login\"]"));
    }

    public WebElement namefield() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@data-qa=\"signup-name\"]"));
    }

    public WebElement emailfield() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@data-qa=\"signup-email\"]"));
    }

    public WebElement signupbutton() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//button[@data-qa=\"signup-button\"]"));
    }

    public WebElement male() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@id=\"id_gender1\"]"));
    }

    public WebElement passwordfield() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@data-qa=\"password\"]"));
    }

    public WebElement day() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//select[@data-qa='days']"));
    }

    public WebElement month() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//select[@data-qa='months']"));
    }

    public WebElement year() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//select[@data-qa='years']"));
    }

    public WebElement option() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//*[@id=\"optin\"]"));
    }

    public WebElement Firstnamefield() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@data-qa=\"first_name\"]"));
    }

    public WebElement Lastnamefield() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@data-qa=\"last_name\"]"));
    }

    public WebElement Addressfield() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@data-qa=\"address\"]"));
    }

    public WebElement coountry() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//select[@data-qa='country']"));
    }
    public WebElement statefield() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@data-qa=\"state\"]"));
    }

    public WebElement cityfield() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@data-qa=\"city\"]"));
    }

    public WebElement zipcodefield() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@data-qa=\"zipcode\"]"));
    }

    public WebElement mobilenumberfield() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@data-qa=\"mobile_number\"]"));
    }

    public WebElement createaccountButton() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//button[@data-qa=\"create-account\"]"));
    }
}

// date of birth


//male

