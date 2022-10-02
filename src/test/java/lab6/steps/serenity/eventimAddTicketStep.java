package lab6.steps.serenity;

import lab6.pages.ResultPageSearch;
import lab6.pages.eventimAfterLoginPage;
import lab6.pages.eventimDavidGarretPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.ui.Duration;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class eventimAddTicketStep extends PageObject {

    eventimAfterLoginPage eventimAfterLoginPage;
    eventimDavidGarretPage eventimDavidGarretPage;
    ResultPageSearch resultPageSearch;



    @Step
    public void searchEvent() throws InterruptedException {

        eventimAfterLoginPage.searchButtonClick();
        eventimAfterLoginPage.setSearchField("david garret");
        eventimAfterLoginPage.setSearchButtonNextToSearchField();
        eventimDavidGarretPage.pageDown();
        assertThat(resultPageSearch.listOfEventTitle(), hasItem(containsString("DAVID")));
        eventimAfterLoginPage.ClickTheEvent();
        eventimDavidGarretPage.pageDown();
        eventimDavidGarretPage.clickButtonTickets();
        eventimDavidGarretPage.pageDown();
        eventimDavidGarretPage.addOneVIPTicket();
        //resultPageSearch.pause(5000);
        eventimDavidGarretPage.addToTheCart();
        //resultPageSearch.pause(10000);
        //eventimDavidGarretPage.waitForEditCart();
        eventimDavidGarretPage.editCart();
//        resultPageSearch.wait_appear();
        assertThat(resultPageSearch.checkTicketINCart(), hasItem(containsString("DAVID GARRETT & BAND - ALIVE TOUR 2022")));
        //20 MAIDAVID GARRETT & BAND - ALIVE TOUR 2022vineri, 20. mai 2022, 20:00BT Arena, Cluj-Napoca, Romania


    }
}
