package pageObject;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage
{
//Locators
    @FindBy(name = "username")
    public static WebElement userName;

    @FindBy(name = "password")
    public static WebElement passWord;

    @FindBy(xpath = "//div[@class='icheckbox_square-blue checked']")
    public static WebElement rememberMe;

    @FindBy (xpath = "//button[@class='btn btn-primary btn-block btn-flat']")
    public static WebElement LoginButton;

//constructor
    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }






  //  Actions

    public static void userNameText()
    {
        userName.sendKeys("admin");
    }
   public static void passwordText()
   {
       passWord.sendKeys("admin");
   }
   public static void rememRadiBtn()
   {
       rememberMe.click();
   }

   public static void clickLoginButton()
   {
       LoginButton.click();
   }


}
