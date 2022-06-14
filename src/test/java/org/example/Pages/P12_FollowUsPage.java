package org.example.Pages;

import org.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P12_FollowUsPage {

    public WebElement facebook(){
        By face=By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]");
        WebElement facelink= Hooks.driver.findElement(face);
        return facelink;
    }
    public WebElement twitter(){
        By twitter=By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]");
        WebElement twitterlink= Hooks.driver.findElement(twitter);
        return twitterlink;
    }
    public WebElement rss(){
        By rss=By.cssSelector("a[href=\"/news/rss/1\"]");
        WebElement rsslink= Hooks.driver.findElement(rss);
        return rsslink;
    }
    public WebElement youtube(){
        By youtube=By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]");
        WebElement youtubelink= Hooks.driver.findElement(youtube);
        return youtubelink;
    }
}
