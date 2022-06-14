package org.example.Pages;

import org.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class P05_SwitchCurrency {

    public WebElement chooseEuro(){
        By euro=By.id("customerCurrency");
        WebElement eurocur= Hooks.driver.findElement(euro);
        Select selectCurrency=new Select(eurocur);
        selectCurrency.selectByVisibleText("Euro");
        return eurocur;
    }
    public WebElement chooseUSD(){
        By usd=By.id("customerCurrency");
        WebElement usdcur=Hooks.driver.findElement(usd);
        Select selectCurrency=new Select(usdcur);
        selectCurrency.selectByVisibleText("US Dollar");
        return usdcur;
    }
    public List<WebElement> currencyEuro(){
        int count =Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]")).size();
        for(int x=0;x<count;x++) {
            String actual = Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]")).get(x).getText();
            String expected = "€";
            Assert.assertTrue(actual.contains(expected), "Error in currency");
        }
        return Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
    }
    public List<WebElement> currencyDollar(){
        int count =Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]")).size();
        for(int x=0;x<count;x++) {
            String actual = Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]")).get(x).getText();
            String expected = "$";
            Assert.assertTrue(actual.contains(expected), "Error in currency");
        }
        return Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
    }
}
