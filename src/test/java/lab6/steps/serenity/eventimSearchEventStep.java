package lab6.steps.serenity;

import lab6.pages.ResultPageSearch;
import lab6.pages.eventimAfterLoginPage;
import lab6.pages.eventimDavidGarretPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class eventimSearchEventStep {

    eventimAfterLoginPage eventimAfterLoginPage;
    ResultPageSearch resultPageSearch;
    lab6.pages.eventimDavidGarretPage eventimDavidGarretPage;



    @Step
    public void searchEvent() {

        eventimAfterLoginPage.searchButtonClick();
        eventimAfterLoginPage.setSearchField("david garret");
        eventimAfterLoginPage.setSearchButtonNextToSearchField();
        //resultPageSearch.wait_appear();
        assertThat(resultPageSearch.listOfEventTitle(), hasItem(containsString("DAVID")));
        eventimDavidGarretPage.pageDown();
        eventimAfterLoginPage.ClickTheEvent();


    }


}
