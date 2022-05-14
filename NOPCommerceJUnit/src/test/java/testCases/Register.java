package testCases;

import base.BasePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Register extends BasePage {
    String homePageActualTitle;
    String registerPageActualTitle;

    @Test
    public void register()
    {

homepage.goToRegisterPage();
        registerPageActualTitle=BasePage.driver.getTitle();
        registerPage.getTitle();
        Assertions.assertEquals(prop.getProperty("registerPageExpectedTitle"), registerPageActualTitle);
registerPage.clickGenderFemaleRadioBtn();
registerPage.enterFirstName();
registerPage.enterLastName();
registerPage.selectDate();
registerPage.selectMonth();
registerPage.selectYear();
registerPage.enterEmail();
registerPage.company();
registerPage.enterPassword();
registerPage.enterConfirmPassword();
registerPage.enterRegisterBtn();




    }
}
