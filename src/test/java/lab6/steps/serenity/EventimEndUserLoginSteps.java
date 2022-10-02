package lab6.steps.serenity;

import lab6.pages.ResultPageSearch;
import lab6.pages.eventimLoginPage;
import net.thucydides.core.annotations.Step;

public class EventimEndUserLoginSteps {

    eventimLoginPage evLogP;
    ResultPageSearch resultPageSearch;

    @Step
    public void goto_home_ftppage() {
        evLogP.open();
    }

    @Step
    public void enter_data_and_click_login(String email, String password) {
        evLogP.enterEmail(email);
        evLogP.enterPassword(password);
        resultPageSearch.pageDown();
        evLogP.clickLogin();
    }

}
