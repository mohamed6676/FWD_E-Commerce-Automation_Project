package org.example.Pages;

import org.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P04_Search {

    public WebElement searchfield(){
        By search=By.cssSelector("input[id=\"small-searchterms\"]");
        WebElement searchfield= Hooks.driver.findElement(search);
        return searchfield;
    }

    public WebElement searchbtn() {
        By searchbtn = By.cssSelector("input[id=\"small-searchterms\"]");
        WebElement searchbuton=Hooks.driver.findElement(searchbtn);
        return searchbuton;
    }

    public WebElement founded(){
        By found=By.cssSelector("h2[class=\"product-title\"] a");
        WebElement foundbuton=Hooks.driver.findElement(found);
        return foundbuton;
    }

}