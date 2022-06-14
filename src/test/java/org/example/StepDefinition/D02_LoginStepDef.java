package org.example.StepDefinition;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P02_LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D02_LoginStepDef {
    P02_LoginPage login=new P02_LoginPage();

    @Given("user navigate to Home page")
    public void user_navigate_to_Home_page() throws InterruptedException {
        String url = "https://demo.nopcommerce.com/";
        Hooks.driver.navigate().to(url);
        Thread.sleep(2000);
    }

    @And("user click on login")
    public void user_click_on_login() throws InterruptedException {
        login.login_link().click();
        Thread.sleep(3000);
    }

    @When("^user enter valid \"(.*)\" and valid \"(.*)\"$")
    public void user_enter_valid_email(String user,String pass){
        login.loginStep(user,pass);
    }

    @And("user clicks login button")
    public void user_clicks_login_button(){
        login.LoginBtn().click();
    }

    @Then("user logged in successfully")
    public void user_logged_in_successfully () throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertFalse(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/login?returnUrl=%2F/"));
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(Hooks.driver.findElement(By.cssSelector("a[href=\"/customer/info\"][class=\"ico-account\"]")).isDisplayed());
        soft.assertTrue(Hooks.driver.findElement(By.cssSelector("a[href=\"/logout\"][class=\"ico-logout\"]")).isDisplayed());
        soft.assertAll();
    }

    @Then("user could not login")
    public void user_could_not_login() throws InterruptedException {
        Thread.sleep(1000);
        String mesage=login.errormessage().getText();
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(mesage.contains("Login was unsuccessful. Please correct the errors and try again."));
        String sscolor=login.errormessage().getCssValue("color");
        soft.assertEquals(sscolor,"#e4434b");
    }
}
