package lab6.features.search;


import lab6.steps.serenity.EventimEndUserLoginSteps;
import lab6.steps.serenity.eventimLoginInvalidErrorStep;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("src/test/resources/features/search/eventimLoginData.csv")
public class eventimLoginValid {

    String email,password, expectedResult;

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public EventimEndUserLoginSteps evLoginSteps;

    @Steps
    public eventimLoginInvalidErrorStep eventimLoginInvalidErrorStep;

    @Test
    public void loginValid() {
        evLoginSteps.goto_home_ftppage();
        evLoginSteps.enter_data_and_click_login(email, password);
        eventimLoginInvalidErrorStep.verifyValidLogin(expectedResult);
    }

}
