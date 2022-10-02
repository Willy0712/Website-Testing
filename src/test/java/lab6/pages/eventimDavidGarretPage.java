package lab6.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;

@DefaultUrl("https://www.eventim.ro/ro/bilete/david-garrett-band-cluj-napoca-bt-arena-521455/event.html")
public class eventimDavidGarretPage extends PageObject {

    @FindBy(xpath = "/html/body/div[3]/div[2]/main/div/div[2]/article/div/div[2]/div/div/a/div[2]")
    private WebElementFacade clickButtonTickets;

    @FindBy(xpath = "/html/body/div[3]/div[2]/main/div/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]")
    private WebElementFacade addOneVIPTicket;

    @FindBy(xpath = "/html/body/div[3]/div[2]/main/div/div[2]/div[2]/div[1]/div[3]/div/button")
    private WebElementFacade addToTheCart;

    @FindBy(xpath = "/html/body/header/div/div[3]/section/ul/li[1]/a")
    private WebElementFacade editCart;

    @FindBy(xpath = "/html/body/div[3]/div[2]/main/div/div[2]/div/ul/li/div/ol/li[2]/a")
    private WebElementFacade deleteTicket;

    public void deleteTicket(){deleteTicket.click();}

    public void editCart(){editCart.click();}
    public void waitForEditCart(){editCart.waitUntilClickable();}


    public void addToTheCart() {addToTheCart.click();
    }

    public void addOneVIPTicket(){addOneVIPTicket.click();}

    public void clickButtonTickets(){clickButtonTickets.click();}

    public void pageDown(){
        JavascriptExecutor jsExecutor =(JavascriptExecutor) getDriver();
        jsExecutor.executeScript("window.scrollBy(0,300)", "");
        // jsExecutor.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }



}
