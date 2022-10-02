package lab6.steps.serenity;

import lab6.pages.eventimInvalidLoginPage;
import lab6.pages.eventimLoginValidPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;


public class eventimLoginInvalidErrorStep {

    eventimInvalidLoginPage eventimInvalidLoginPage;
    eventimLoginValidPage eventimLoginValidPage;

    @Step
    public void verifyInvalidLoginMessage(String message){
        assertThat(eventimInvalidLoginPage.invalidLoginErrorMessage(), hasItem(containsString(message)));
    }

    @Step
    public void verifyValidLogin(String message){
        assertThat(eventimLoginValidPage.validLoginErrorMessage(), hasItem(containsString(message)));
    }
}
