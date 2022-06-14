package org.example.Pages;

import org.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P10_WishPage {
    public WebElement htc(){
        By htc=By.cssSelector("a[href=\"/htc-one-m8-android-l-50-lollipop\"]");
        WebElement htcM8= Hooks.driver.findElement(htc);
        return htcM8;
    }
    public WebElement addHTCtoWish(){
        By add=By.id("add-to-wishlist-button-18");
        WebElement addtochart=Hooks.driver.findElement(add);
        return addtochart;
    }
    public WebElement notificationmessage(){
        By noty=By.cssSelector("div[class=\"bar-notification success\"]");
        WebElement notify=Hooks.driver.findElement(noty);
        return notify;
    }
    public WebElement portableSpeakers(){
        By speak=By.cssSelector("a[href=\"/portable-sound-speakers\"]");
        WebElement speaker= Hooks.driver.findElement(speak);
        return speaker;
    }
    public WebElement addPortableSpeakersbtn(){
        By add=By.id("add-to-wishlist-button-23");
        WebElement addtochart=Hooks.driver.findElement(add);
        return addtochart;
    }
    public WebElement digitalDownloads(){
        By digit=By.xpath("//ul[@class=\"top-menu notmobile\"]//li//a[@href=\"/digital-downloads\"]");
        WebElement digitdown=Hooks.driver.findElement(digit);
        return digitdown;
    }
    public WebElement scienceandfaith(){
        By scien=By.cssSelector("a[href=\"/science-faith\"]");
        WebElement scf=Hooks.driver.findElement(scien);
        return scf;
    }
    public WebElement priceField(){
        By pricef=By.cssSelector("input[class=\"enter-price-input\"]");
        WebElement pricfield=Hooks.driver.findElement(pricef);
        return pricfield;
    }
    public WebElement addScienceFaithtoCart(){
        By add=By.id("add-to-wishlist-button-36");
        WebElement addscf=Hooks.driver.findElement(add);
        return addscf;
    }
}
