package org.example.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.Pages.P11_SliderPage;
import org.testng.Assert;

public class D11_SliderStepDef {
    P11_SliderPage slider=new P11_SliderPage();

    @When("user click on buton_one and click on slider_one")
    public void click_slider_one() throws InterruptedException {
        slider.butn_one().click();
        slider.butn_one().click();
        Thread.sleep(2000);
        slider.slider_one().click();
        Thread.sleep(3000);
    }

    @And("should navigated to the slider_product_one page")
    public void navigated_slider_product_one(){
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/nokia-lumia-1020"),"Error in product link");
    }

    @When("user click on buton_two and click on slider_two")
    public void click_slider_two() throws InterruptedException {
        slider.butn_two().click();
        slider.butn_two().click();
        Thread.sleep(2000);
        slider.slider_two().click();
    }

    @And("should navigated to the slider_product_two page")
    public void navigated_slider_product_two(){
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/iphone-6"),"Error in product link");
    }

}
