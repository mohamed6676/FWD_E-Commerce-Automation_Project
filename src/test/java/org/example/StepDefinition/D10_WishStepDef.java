package org.example.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P10_WishPage;
import org.testng.Assert;

public class D10_WishStepDef {
    P10_WishPage wish=new P10_WishPage();

    @When("click on HTC_One_M8_Android")
    public void click_on_HTC_One_M8_Android() throws InterruptedException {
        Thread.sleep(4000);
        wish.htc().click();
        Thread.sleep(4000);
    }
    @And("add HTC_One_M8_Android to wishlist")
    public void add_HTC_One_M8_Android_to_wishlist() throws InterruptedException {
        wish.addHTCtoWish().click();
        Thread.sleep(2000);
    }

    @Then("success message appears__1")
    public void success_message_appears__1(){
        String actual=wish.notificationmessage().getText();
        String expected="The product has been added to your wishlist";
        Assert.assertTrue(actual.contains(expected),"HTC One M8 Android L 5.0 Lollipop is added to wishlist");
        System.out.println("HTC One M8 Android L 5.0 Lollipop is added to wishlist");
    }

    @When("click on Portable_Sound_Speakers")
    public void click_on_Portable_Sound_Speakers() throws InterruptedException {
        Thread.sleep(1000);
        wish.portableSpeakers().click();
        Thread.sleep(4000);
    }

    @And("add Portable_Sound_Speakers to wishlist")
    public void add_Portable_Sound_Speakers_to_wishlist() throws InterruptedException {
        wish.addPortableSpeakersbtn().click();
        Thread.sleep(3000);
    }

    @Then("success message appears__2")
    public void success_message_appears__2() throws InterruptedException {
        String actual=wish.notificationmessage().getText();
        String expected="The product has been added to your wishlist";
        Assert.assertTrue(actual.contains(expected),"Portable Sound Speakers is added to wishlist");
        System.out.println("Portable Sound Speakers is added to wishlist");
        Thread.sleep(2000);
    }

    @When("go to digital_downloads")
    public void go_to_digital_downloads() throws InterruptedException {
        Thread.sleep(1000);
        wish.digitalDownloads().click();
        Thread.sleep(3000);
    }

    @And("click on Science_and_Faith")
    public void click_on_Science_and_Faith() throws InterruptedException {
        wish.scienceandfaith().click();
        Thread.sleep(3000);
    }

    @And("fill mandatory field")
    public void fill_mandatory_field(){
        wish.priceField().sendKeys("50");
    }

    @And("click on add_to_wishlist")
    public void click_on_add_to_wishlist() throws InterruptedException {
        wish.addScienceFaithtoCart().click();
        Thread.sleep(2000);
    }

    @Then("success message appears__3")
    public void success_message_appears__3(){
        String actual=wish.notificationmessage().getText();
        String expected="The product has been added to your wishlist";
        Assert.assertTrue(actual.contains(expected),"Science & Faith is added to wishlist");
        System.out.print("Science & Faith is added to wishlist");
    }



}
