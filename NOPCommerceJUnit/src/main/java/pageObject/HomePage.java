package pageObject;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage  {
    WebDriver driver;
    //constructor
    public HomePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);


    }


    //locators
    @FindBy(linkText = "Register")
    public WebElement register;

    // actions
    public void goToRegisterPage()
    {
        register.click();
    }





}
