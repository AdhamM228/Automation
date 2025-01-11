package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import steps.Hooks;

import java.sql.Driver;

public class loginpage {

    public WebDriver driver=Hooks.driver;

    public WebElement signuploginButton() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//a[@href=\"/login\"]"));
    }
    public WebElement emailfield() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]"));
    }
    public WebElement passwordfield() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]"));
    }
    public WebElement loginButton() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]"));
    }
    //public WebElement country() throws InterruptedException {
      //  Thread.sleep(2000);
        //return driver.findElement(By.xpath("//select[@data-qa=\"country\"]"));
    //}




    }

