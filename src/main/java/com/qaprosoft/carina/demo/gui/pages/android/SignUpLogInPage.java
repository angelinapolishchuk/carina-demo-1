package com.qaprosoft.carina.demo.gui.pages.android;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.awt.*;

public class SignUpLogInPage extends AbstractPage{


        public SignUpLogInPage(WebDriver driver) {
            super(driver);
        }

        @FindBy(xpath = "//*[@class ='login-form']//*[@name='email']")
        private ExtendedWebElement emailTextField;

        @FindBy(xpath = "//*[@name='password']")
        private ExtendedWebElement passwordTextField;

        @FindBy(xpath = "//*[@class='login_container']")
        private ExtendedWebElement logInBtn;

        @FindBy(xpath = "//*[@class='nav navbar-nav']")
        private Menu menu;



        @Override
        public boolean isPageOpened() {
            return emailTextField.isElementPresent();
        }

        public void typeEmail(String email) {
            emailTextField.type(email);
        }

        public void typePassword(String password) {
            passwordTextField.type(password);
        }

        public void clickLogInBtn() {
            logInBtn.click();
        }
    }


