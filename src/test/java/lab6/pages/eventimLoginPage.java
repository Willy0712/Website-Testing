package lab6.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
@DefaultUrl("https://www.eventim.ro/ro/sign-in/")
public class eventimLoginPage extends PageObject {



        @FindBy(name = "email")
        private WebElementFacade emailField;

        @FindBy(name = "password")
        private WebElementFacade passwordField;

        @FindBy(id = "loginButton")
        private WebElementFacade loginButton;



        public void enterEmail(String email) {emailField.type(email);}

        public void enterPassword(String password) {passwordField.type(password);}

        public void clickLogin() {loginButton.click();}



    }

