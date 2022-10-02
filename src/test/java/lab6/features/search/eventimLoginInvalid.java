package lab6.features.search;

import lab6.pages.eventimInvalidLoginPage;
import lab6.steps.serenity.EventimEndUserLoginSteps;
import lab6.steps.serenity.eventimLoginInvalidErrorStep;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)
public class eventimLoginInvalid {

    String email,password;

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public EventimEndUserLoginSteps evLoginSteps;

    @Steps
    public eventimLoginInvalidErrorStep eventimLoginInvalidErrorStep;



    @Issue("Login invalid")
    @Test
    public void loginInValid() {
        evLoginSteps.goto_home_ftppage();
        evLoginSteps.enter_data_and_click_login("vulu07@yahoo.com", "sdsgfvdfv");
        eventimLoginInvalidErrorStep.verifyInvalidLoginMessage("esuat");


    }




}
