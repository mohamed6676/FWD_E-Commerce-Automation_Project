package org.example.Pages;

import org.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P03_ForgotPassPage {

    public WebElement forgotPassBtn(){
        By forgotpassbtn=By.cssSelector("a[href=\"/passwordrecovery\"]");
        WebElement frpasbtn= Hooks.driver.findElement(forgotpassbtn);
        return frpasbtn;
    }

    public WebElement emailField(){
        By emailfield=By.cssSelector("input[class=\"email\"]");
        WebElement Email=Hooks.driver.findElement(emailfield);
        return Email;
    }

    public WebElement recoverbtn(){
        By rec=By.cssSelector("button[name=\"send-email\"]");
        WebElement recovery=Hooks.driver.findElement(rec);
        return recovery;
    }
}
