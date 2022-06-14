package org.example.Pages;

import org.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P09_CartPage {
    public WebElement htc(){
        By htc=By.cssSelector("a[href=\"/htc-one-m8-android-l-50-lollipop\"]");
        WebElement htcM8= Hooks.driver.findElement(htc);
        return htcM8;
    }
    public WebElement adtocharthtc(){
        By add=By.id("add-to-cart-button-18");
        WebElement addtochart=Hooks.driver.findElement(add);
        return addtochart;
    }
    public WebElement message1(){
        By msg=By.cssSelector("div[class=\"bar-notification success\"]");
        WebElement msge=Hooks.driver.findElement(msg);
        return msge;
    }

    public WebElement nokialumia(){
        By nokia=By.cssSelector("a[href=\"/nokia-lumia-1020\"]");
        WebElement nokialumia=Hooks.driver.findElement(nokia);
        return nokialumia;
    }
    public WebElement addtochartnokia(){
        By add=By.id("add-to-cart-button-20");
        WebElement addtochart=Hooks.driver.findElement(add);
        return addtochart;
    }
    public WebElement giftcardbtn(){
        By gift=By.xpath("//ul[@class=\"top-menu notmobile\"]//li//a[@href=\"/gift-cards\"]");
        WebElement giftcard=Hooks.driver.findElement(gift);
        return giftcard;
    }
    public WebElement physicalgiftcard(){
        By physicalgift=By.cssSelector("a[href=\"/50-physical-gift-card\"]");
        WebElement physic=Hooks.driver.findElement(physicalgift);
        return physic;
    }
    public WebElement recipentname(){
        By recip=By.id("giftcard_44_RecipientName");
        WebElement recipname=Hooks.driver.findElement(recip);
        return recipname;
    }
    public WebElement sendername(){
        By send=By.id("giftcard_44_SenderName");
        WebElement sender=Hooks.driver.findElement(send);
        return sender;
    }
    public WebElement messagename(){
        By message=By.id("giftcard_44_Message");
        WebElement meso=Hooks.driver.findElement(message);
        return meso;
    }

    public WebElement physicgiftbutn(){
        By add=By.id("add-to-cart-button-44");
        WebElement addtochart=Hooks.driver.findElement(add);
        return addtochart;
    }

}
