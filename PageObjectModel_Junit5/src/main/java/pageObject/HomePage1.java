package pageObject;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage1 {
WebDriver driver;
    @FindBy (id= "small-searchterms")
    public WebElement SearchTextBox;

    @FindBy(className = "search-box-button")
    public WebElement SearchButton;

    //constructor
    public HomePage1(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    //Actions
    public void EnterText(String product)
    {
        SearchTextBox.sendKeys(product);
    }
 public void ClickSearchButton()
 {
     SearchButton.click();
 }





}
