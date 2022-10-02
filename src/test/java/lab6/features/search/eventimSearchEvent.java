package lab6.features.search;

import lab6.steps.serenity.EventimEndUserLoginSteps;
import lab6.steps.serenity.eventimSearchEventStep;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class eventimSearchEvent {



    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public EventimEndUserLoginSteps evLoginSteps;

    @Steps(shared=true)
    public eventimSearchEventStep eventimSearchEventStep;

    @Test
    public void searchEvent() {
        evLoginSteps.goto_home_ftppage();
        evLoginSteps.enter_data_and_click_login("vulu07@yahoo.com","Szorakozas1");
        eventimSearchEventStep.searchEvent();

    }
}
