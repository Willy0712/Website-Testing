package lab6.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.eventim.ro/ro/contul_meu/my_orders.html")
public class eventimAfterLoginPage extends PageObject {

    @FindBy(xpath = "/html/body/div[3]/header/div[1]/div/div[2]/a[1]")
    private WebElementFacade searchButton;

    @FindBy(xpath = "//*[@id=\"api-search\"]")
    private WebElementFacade searchField;

    @FindBy(xpath = "/html/body/div[3]/div[2]/main/div/div[1]/div/div/div[2]/div[1]/form/div/button")
    private WebElementFacade searchButtonNextToSearchField;

    @FindBy(xpath = "/html/body/div[3]/div[2]/main/div/div[2]/div/div/div[1]/a[2]")
    private WebElementFacade clickTheEvent;



    public void searchButtonClick(){searchButton.click();}

    public  void setSearchField(String eventName){searchField.type(eventName);}

    public void setSearchButtonNextToSearchField(){searchButtonNextToSearchField.click();}

    public void ClickTheEvent() {
        clickTheEvent.click();
    }
}
