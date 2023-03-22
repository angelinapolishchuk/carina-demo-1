package com.qaprosoft.carina.demo.gui.pages.android;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SignUpLogInPage extends AbstractPage {


    public SignUpLogInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='user-name']")
    private ExtendedWebElement usernameTextField;

    @FindBy (xpath = "//input[@id='password']")
    private ExtendedWebElement passwordTextField;

    @FindBy(xpath = "//*[@class='login_container']")
    private ExtendedWebElement logInBtn;



    @Override
    public boolean isPageOpened() {
        return usernameTextField.isElementPresent();
    }

    public void typeUsername(String username) {
        usernameTextField.type(username);
    }

    public void typePassword(String password) {
        passwordTextField.type(password);
    }

    public void clickLogInBtn() {
        logInBtn.click();
    }
}
