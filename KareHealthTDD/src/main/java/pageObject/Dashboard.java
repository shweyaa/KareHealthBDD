package pageObject;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard extends BasePage {



    @FindBy(linkText = "Total Orders")
    public static WebElement OrderDetails;


    public Dashboard(WebDriver driver)
    {
        this.driver= driver;
        PageFactory.initElements(driver,this);

    }

    public static void TotalOrders()
    {
        OrderDetails.click();
    }

}
