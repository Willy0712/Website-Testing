package lab6.features.search;

import lab6.steps.serenity.EventimEndUserLoginSteps;
import lab6.steps.serenity.eventimAddTicketStep;
import lab6.steps.serenity.eventimDeleteTicketStep;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class eventimDeleteTicket {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public EventimEndUserLoginSteps evLoginSteps;

    @Steps(shared=true)
    public lab6.steps.serenity.eventimSearchEventStep eventimSearchEventStep;

    @Steps
    public eventimDeleteTicketStep eventimDeleteTicketStep;

    @Test
    public void searchEvent() throws InterruptedException {
        evLoginSteps.goto_home_ftppage();
        evLoginSteps.enter_data_and_click_login("vulu07@yahoo.com","Szorakozas1");
        eventimDeleteTicketStep.searchEvent();

    }
}
