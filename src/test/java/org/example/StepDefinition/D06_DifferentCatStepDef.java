package org.example.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;
import org.example.Pages.P06_DifferentCatPage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D06_DifferentCatStepDef {
    P06_DifferentCatPage category=new P06_DifferentCatPage();

    @When("user select Computer categories then software subcategory")
    public void user_select_Computer_categories_then_software_subcategory() throws InterruptedException {
        Thread.sleep(2000);
        category.computersthensoftware();
        Thread.sleep(3000);
        String expected="Software";
        String actual=Hooks.driver.findElement(By.xpath("//div[@class=\"page-title\"]//h1")).getText();
        Assert.assertTrue(actual.contains(expected),"Actual result is same as expected");
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/software"));
    }

    @And("user choose Books categories")
    public void user_choose_Books_categories() throws InterruptedException {
        Thread.sleep(2000);
        category.books().click();
        Thread.sleep(3000);
        String expected="Books";
        String actual=Hooks.driver.findElement(By.xpath("//div[@class=\"page-title\"]//h1")).getText();
        Assert.assertTrue(actual.contains(expected),"Actual result is same as expected");
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/books"));
    }

    @And("user select Electronics categories then cell phones subcategory")
    public void user_select_Electronics_categories_then_cell_phones_subcategory() throws InterruptedException {
        Thread.sleep(2000);
        category.electronicsthencellphones();
        Thread.sleep(3000);
        String expected="Cell phones";
        String actual=Hooks.driver.findElement(By.xpath("//div[@class=\"page-title\"]//h1")).getText();
        Assert.assertTrue(actual.contains(expected),"Actual result is same as expected");
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/cell-phones"));
    }

    @And("user choose Gift Cards categories")
    public void user_choose_Gift_Cards_categories() throws InterruptedException {
        Thread.sleep(2000);
        category.giftcards().click();
        Thread.sleep(3000);
        String expected="Gift Cards";
        String actual=Hooks.driver.findElement(By.xpath("//div[@class=\"page-title\"]//h1")).getText();
        Assert.assertTrue(actual.contains(expected),"Actual result is same as expected");
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/gift-cards"));
    }

}
