package org.example.Pages;

import org.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P11_SliderPage {

    public WebElement butn_one(){
        WebElement btn= Hooks.driver.findElement(By.cssSelector("a[rel=\"1\"]"));
        return btn;
    }
    public WebElement butn_two(){
        WebElement btn= Hooks.driver.findElement(By.cssSelector("a[rel=\"0\"]"));
        return btn;
    }

    public WebElement slider_one(){
        WebElement slider=Hooks.driver.findElement(By.cssSelector("div[id=\"nivo-slider\"]"));
        return slider;
    }

    public WebElement slider_two(){
        WebElement slider=Hooks.driver.findElement(By.cssSelector("div[id=\"nivo-slider\"]"));
        return slider;
    }

}
