package org.example.Pages;

import org.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class P08_DifferentTagsPage {

    public WebElement cool(){
        By col=By.cssSelector("a[href=\"/cool\"]");
        WebElement cool= Hooks.driver.findElement(col);
        return cool;
    }
    public WebElement game(){
        By col=By.cssSelector("a[href=\"/game\"]");
        WebElement cool= Hooks.driver.findElement(col);
        return cool;
    }
    public WebElement computer(){
        By col=By.cssSelector("a[href=\"/computer\"]");
        WebElement cool= Hooks.driver.findElement(col);
        return cool;
    }

}
