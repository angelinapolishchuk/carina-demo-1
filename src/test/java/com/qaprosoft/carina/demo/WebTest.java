package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.gui.pages.android.HomePage;
import com.qaprosoft.carina.demo.gui.pages.android.SignUpLogInPage;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.utils.R;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTest implements IAbstractTest {

    @Test
    @MethodOwner(owner = "apolishchuk")
    public void loginTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Page is not opened");
        SignUpLogInPage signUpLogInPage = homePage.clickSingUpLogInBtn();
        Assert.assertTrue(signUpLogInPage.isPageOpened(), "Page is not opened");
        signUpLogInPage.typeUsername(R.TESTDATA.get("standard_user"));
        signUpLogInPage.typePassword(R.TESTDATA.get("secret_sauce"));
        signUpLogInPage.clickLogInBtn();
        Assert.assertFalse(homePage.isPageOpened(), "Page is opened");
    }
}