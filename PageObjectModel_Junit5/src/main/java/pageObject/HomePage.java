package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;
    //
    // SearchButton
    @FindBy(id = "small-searchterms")
    public WebElement SearchTextBox;

    @FindBy(className = "search-box-button")
    public WebElement SearchButton;

   // computers
    @FindBy(linkText = "Computers")
    public WebElement computers;


    /*DesktopPage

        @FindBy(linkText = "Desktops")
        public WebElement desktopPage;
        Actions actions=new Actions(driver);

    public Actions getActions() {
        return actions;
        actions.moveToElement(computers).perform()
    }*/

    //constructor
  public HomePage(WebDriver driver)
  {
     this.driver=driver;

      PageFactory.initElements(driver,this
      );
  }
    //Actions
    //searchButton
    public void TextSearchButton(String product)
    {
        SearchTextBox.sendKeys(product);
    }

    public void clickSearchButton()
    {
        SearchButton.click();

    }
    // computerPage
    public void computerPage()
    {
        computers.click();
    }



}
