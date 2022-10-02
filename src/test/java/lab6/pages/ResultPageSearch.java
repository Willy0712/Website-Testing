package lab6.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.internal.Coordinates;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

//@DefaultUrl("https://www.eventim.ro/ro/cautare/?lang=ro&searchText=david+garret")
public class ResultPageSearch extends PageObject {


    @FindBy(xpath="/html/body/div[3]/div[2]/main/div/div[2]/aside/form/div/h2")
    private WebElementFacade resultHeading;

    @WhenPageOpens
    public void wait_appear() {
        resultHeading.waitUntilVisible();
    }

    public void pageDown() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("window.scrollBy(0 ,500)", "");
        // jsExecutor.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }

    public void pageUp() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("window.scrollBy(0,-500)", "");
        // jsExecutor.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }

    public List<String> getDefinitions() {
        List<WebElementFacade> definitionList = findAll(By.className("m-searchListItem__block"));
        List<String> eventListResults = new ArrayList<>();
        for(WebElementFacade d : definitionList){
            WebElementFacade title = d.find(By.tagName("h3"));
            eventListResults.add(title.getText());
        }
        return eventListResults;
    }

    public List<String> listOfEventTitle(){
        List<WebElementFacade> listAfterElements = findAll(By.className("m-searchListItem__title"));
        List<String> eventListResults = new ArrayList<>();
        for(WebElementFacade d : listAfterElements){
            eventListResults.add(d.getText());
        }
        return eventListResults;
    }



    public List<String> checkTicketINCart() {
        WebElementFacade definitionList = find(By.className("m-cartItem"));
        return definitionList.findElements(By.className("m-eventListItem")).stream()
                .map(element -> element.getText())
                .collect(Collectors.toList());

    }

    public List<String> checkTicketAfterDelete() {
        WebElementFacade definitionList = find(By.className("m-blockNotice__content"));
        return definitionList.findElements(By.tagName("p")).stream()
                .map(element -> element.getText())
                .collect(Collectors.toList());

    }



    public void pause(Integer milliseconds) {
        try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
