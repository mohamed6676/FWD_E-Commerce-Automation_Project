package org.example.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P01_RegisterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D01_RegisterStepDef {

    P01_RegisterPage register=new P01_RegisterPage();

    @And("user navigate to home page")
    public void user_navigate_to_home_page()
    {
        String url = "https://demo.nopcommerce.com/";
        Hooks.driver.navigate() .to(url);
    }

    @And("user click register")
    public void user_click_register(){
        register.register_link().click();
    }

    @When("^user fills gender\"(.*)\" fname\"(.*)\" lname\"(.*)\" day\"(.*)\" month\"(.*)\" year\"(.*)\" email\"(.*)\" valid data$")
    public void user_fills_personal_valid_data(String gender,String fname,String lname,String day,String month,String year,String email) throws InterruptedException {
        Thread.sleep(1000);
        register.gendertype(gender).click();
        register.first_name().sendKeys(fname);
        register.last_name().sendKeys(lname);
        Thread.sleep(1000);
        Select selectedday =new Select(register.day());
        selectedday.selectByVisibleText(day);
        Select selectedmonth =new Select(register.month());
        selectedmonth.selectByValue(month);
        Select selectedyear =new Select(register.year());
        selectedyear.selectByVisibleText(year);
        register.email().sendKeys(email);
    }

    @And("^user fills valid password \"(.*)\" confirm \"(.*)\"$")
    public void user_fills_valid_password(String pass,String confirm){
        register.password().sendKeys(pass);
        register.confirmPassword().sendKeys(confirm);
    }

    @And("user clicks register button")
    public void user_clicks_register_button() throws InterruptedException {
        register.registerBtn().click();
        Thread.sleep(3000);
    }

    @Then("success message is displayed")
    public void success_message_is_displayed(){
        Assert.assertTrue(Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]")).isDisplayed());
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]")).isDisplayed());
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/registerresult/1?returnUrl=/"));
        soft.assertTrue(Hooks.driver.findElement(By.cssSelector("a[href=\"/customer/info\"][class=\"ico-account\"]")).isDisplayed());
        soft.assertTrue(Hooks.driver.findElement(By.cssSelector("a[href=\"/logout\"][class=\"ico-logout\"]")).isDisplayed());
        String message=Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]")).getCssValue("color");
        soft.assertEquals(message,"rgba(76, 177, 124, 1)");
        soft.assertAll();
    }


}
