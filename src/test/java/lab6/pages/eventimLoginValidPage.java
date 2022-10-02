package lab6.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class eventimLoginValidPage extends PageObject {

    public List<String> validLoginErrorMessage() {
        List<WebElementFacade> errorParagraph = findAll(By.tagName("h1"));
        List<String> errorParagraphResults = new ArrayList<>();
        for(WebElementFacade d : errorParagraph){
            errorParagraphResults.add(d.getText());
        }
        return errorParagraphResults;
    }
}
