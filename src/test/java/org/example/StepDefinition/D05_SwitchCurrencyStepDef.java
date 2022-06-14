package org.example.StepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P05_SwitchCurrency;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D05_SwitchCurrencyStepDef {
    P05_SwitchCurrency currency=new P05_SwitchCurrency();

    @When("user choose Euro from dropdown menu")
    public void user_choose_Euro_from_dropdown_menu() throws InterruptedException {
        currency.chooseEuro();
        Thread.sleep(3000);
    }

    @Then("euro is selected successfully")
    public void euro_is_selected_successfully() throws InterruptedException {
        String selected=Hooks.driver.findElement(By.cssSelector("select[onchange=\"setLocation(this.value)\"]")).getText();
        Assert.assertTrue(selected.contains("Euro"),"Euro is selected Successfully");
        currency.currencyEuro();
        Thread.sleep(1000);
    }

    @When("user choose USD from dropdown menu")
    public void user_choose_USD_from_dropdown_menu() throws InterruptedException {
        currency.chooseUSD();
        Thread.sleep(3000);
    }

    @Then("usd is selected successfully")
    public void usd_is_selected_successfully() throws InterruptedException {
        String selected=Hooks.driver.findElement(By.cssSelector("select[onchange=\"setLocation(this.value)\"]")).getText();
        Assert.assertTrue(selected.contains("US Dollar"),"US Dollar is selected Successfully");
        currency.currencyDollar();
        Thread.sleep(1000);
    }

}
