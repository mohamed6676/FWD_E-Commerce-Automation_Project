package org.example.Pages;

import org.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class P06_DifferentCatPage {

    public WebElement computersthensoftware(){
        By comp= By.xpath("//ul[@class=\"top-menu notmobile\"]//li//a[@href=\"/computers\"]");
        WebElement computers=Hooks.driver.findElement(comp);
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(computers).build().perform();
        By soft=By.xpath("//ul[@class=\"sublist first-level\"]//li//a[@href=\"/software\"]");
        WebElement software=Hooks.driver.findElement(soft);
        action.moveToElement(software).click().build().perform();
        return software;
    }
    public WebElement books(){
        By book=By.xpath("//ul[@class=\"top-menu notmobile\"]//li//a[@href=\"/books\"]");
        WebElement books=Hooks.driver.findElement(book);
        return books;
    }
    public WebElement electronicsthencellphones() {
        By subcat = By.cssSelector("a[href=\"/electronics\"]");
        WebElement selectedsub = Hooks.driver.findElement(subcat);
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(selectedsub).build().perform();
        By cellphone = By.cssSelector("a[href=\"/cell-phones\"]");
        WebElement Electronics_SubCategory_Camera_photo = Hooks.driver.findElement(cellphone);
        action.moveToElement(Electronics_SubCategory_Camera_photo).click().build().perform();
        return selectedsub;
    }
    public WebElement giftcards(){
        By gift=By.xpath("//ul[@class=\"top-menu notmobile\"]//li//a[@href=\"/gift-cards\"]");
        WebElement giftcard=Hooks.driver.findElement(gift);
        return giftcard;
    }
}
