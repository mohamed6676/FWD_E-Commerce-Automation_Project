package org.example.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.Pages.P07_FilterWColorPage;

public class D07_FilterWColorStepDef {
    P07_FilterWColorPage filter=new P07_FilterWColorPage();

    @And("user select shoes from apparel")
    public void user_select_Apparel_category_then_Shoes_subcategory() throws InterruptedException {
        Thread.sleep(1000);
        filter.Apparelthenshoes().click();
        Thread.sleep(1000);
    }

    @And("filter by Red color")
    public void filter_by_Red_color() throws InterruptedException {
        filter.filteredcolorbutn().click();
        Thread.sleep(2000);
    }
}
