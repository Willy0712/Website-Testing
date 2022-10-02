package lab6.steps.serenity;

import lab6.pages.ResultPageSearch;
import lab6.pages.eventimAfterLoginPage;
import lab6.pages.eventimDavidGarretPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class eventimDeleteTicketStep extends PageObject {

    lab6.pages.eventimAfterLoginPage eventimAfterLoginPage;
    lab6.pages.eventimDavidGarretPage eventimDavidGarretPage;
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
        eventimDavidGarretPage.addToTheCart();
       // resultPageSearch.pause(10000);
       // eventimDavidGarretPage.waitForEditCart();
        eventimDavidGarretPage.editCart();
        assertThat(resultPageSearch.checkTicketINCart(), hasItem(containsString("DAVID GARRETT & BAND - ALIVE TOUR 2022")));
        eventimDavidGarretPage.pageDown();
        eventimDavidGarretPage.deleteTicket();
        assertThat(resultPageSearch.checkTicketAfterDelete(), hasItem(containsString("gol")));



    }
}
