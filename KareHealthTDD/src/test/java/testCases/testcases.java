package testCases;

import base.BasePage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.Dashboard;
import pageObject.LoginPage;

public class testcases extends BasePage {
    WebDriver Wait;
    @Test
    public void loginPage() {
        LoginPage.userNameText();
        LoginPage.passwordText();
        //LoginPage.rememRadiBtn();
        LoginPage.clickLoginButton();
       /* Wait=new WebDriverWait(driver,30)
                Wait.until(ExpectedConditions.visibilityOf(Dashboard));*/
    Dashboard.TotalOrders();

    }


}