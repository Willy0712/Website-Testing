package lab6.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class eventimInvalidLoginPage extends PageObject {

    public List<String> invalidLoginErrorMessage() {
        List<WebElementFacade> errorParagraph = findAll(By.id("invalid_login_error"));
        List<String> errorParagraphResults = new ArrayList<>();
        for(WebElementFacade d : errorParagraph){
            errorParagraphResults.add(d.getText());
        }
        return errorParagraphResults;
    }
}
