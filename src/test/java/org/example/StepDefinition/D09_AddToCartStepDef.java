package org.example.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P09_CartPage;
import org.testng.Assert;

public class D09_AddToCartStepDef {
    P09_CartPage cart=new P09_CartPage();

    @Given("user go to home page")
    public void user_go_to_home_page() throws InterruptedException {
        Thread.sleep(3000);
    }

    @When("user add HTC_M8Android to the cart")
    public void user_add_HTC_M8Android_to_the_cart() throws InterruptedException {
        cart.htc().click();
        Thread.sleep(3000);
    }

    @And("user click add_to_cart button_1")
    public void user_click_add_to_cart_button_1() throws InterruptedException {
        cart.adtocharthtc().click();
        Thread.sleep(1000);
    }

    @Then("success message appears_1")
    public void success_message_appears_1(){
        String expected="The product has been added to your shopping cart";
        String actual=cart.message1().getText();
        Assert.assertTrue(actual.contains(expected),"HTC One M8 Android L 5.0 Lollipop is added successfully!");
        System.out.println("HTC One M8 Android L 5.0 Lollipop is added successfully!");
    }

    @When("user add nokia_lumia_1020 to the cart")
    public void user_add_nokia_lumia_1020_to_the_cart() throws InterruptedException {
        cart.nokialumia().click();
        Thread.sleep(3000);

    }

    @And("user click add_to_cart button_2")
    public void user_click_add_to_cart_button_2() throws InterruptedException {
        cart.addtochartnokia().click();
        Thread.sleep(1000);
    }

    @Then("success message appears_2")
    public void success_message_appears_2(){
        String expected="The product has been added to your shopping cart";
        String actual=cart.message1().getText();
        Assert.assertTrue(actual.contains(expected),"Nokia Lumia 1020 is added successfully!");
        System.out.println("Nokia Lumia 1020 is added successfully!");
    }

    @When("user add gift card to the cart")
    public void user_add_gift_card_to_the_cart() throws InterruptedException {
        cart.giftcardbtn().click();
        Thread.sleep(4000);
        cart.physicalgiftcard().click();
        Thread.sleep(2000);
    }

    @And("user fills the mandatory fields")
    public void user_fills_the_mandatory_fields(){
        cart.recipentname().sendKeys("Mohamed");
        cart.sendername().sendKeys("Ahmed");
        cart.messagename().sendKeys("Thank you");
    }

    @And("user click add_to_cart button_3")
    public void user_click_add_to_cart_button_3() throws InterruptedException {
        cart.physicgiftbutn().click();
        Thread.sleep(1000);
    }

    @Then("success message appears_3")
    public void success_message_appears_3(){
        String expected="The product has been added to your shopping cart";
        String actual=cart.message1().getText();
        Assert.assertTrue(actual.contains(expected),"$50 Physical Gift Card is added successfully!");
        System.out.println("$50 Physical Gift Card is added successfully!");
    }

}
