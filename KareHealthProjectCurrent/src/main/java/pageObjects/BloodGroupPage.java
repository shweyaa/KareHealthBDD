package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class BloodGroupPage {


    WebDriver driver;
    public String bloodGroup;
    public String selectedStatus;

    // page locators
    @FindBy(xpath = "//ul[@class='sidebar-menu']")
    public WebElement sidebar;
    @FindBy(xpath= "//span[contains(text(),'Blood Groups')]")
    public WebElement BloodGroupBtn;

    //Create blood Group
    @FindBy(xpath = "//span[contains (text(), 'New')]")
    public WebElement NewBTnBloodGroup;
    @FindBy(css="input#blood_group")
    public WebElement BloodGroupText;
    @FindBy(xpath = "//select[@class='form-control status select2-hidden-accessible']")
    public WebElement selectStatus;
    @FindBy(xpath = "//button[@class='btn btn-primary']")
   public WebElement BloodGroupsubmitBtn;

    //Filter blood group
    @FindBy(xpath = "//span[contains(text(),'Filter')]")
    public WebElement filterBloodGroupBtn;
    @FindBy(xpath = "//input[@name='id']")
    public WebElement idFilterTxt;
    @FindBy(xpath = "//input[@name='blood_group']")
    public WebElement bloodGroupFilterTxt;
    @FindBy(xpath = "//select[@name='status']")
    public WebElement filterStatusBtn;
    @FindBy (xpath = "//button[contains (text(),'Search')]")
    public WebElement filterSearchBtn;
    @FindBy(xpath = "//a[contains(text(),'Reset')]")
    public WebElement filterResetBtn;

    //edit button

    @FindBy(xpath = "(//a[@data-toggle='dropdown'])[6]")
    public WebElement editBtn;
    @FindBy(xpath = "//a[contains (text(),'Edit')]")
    public WebElement ClickEditBtn;

    //Delete
    @FindBy(linkText = "Delete")
    public WebElement DeleteBtn;
    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    public WebElement ConfirmDeleteBtn;
    @FindBy(xpath = "//button[@class='swal2-cancel swal2-styled']")
    public WebElement CancelDeleteBtn;

    //constructor

    public BloodGroupPage ( WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this );
    }

    //page actions
    public WebElement getWebElement(By locator)
    {
        return driver.findElement(locator);
    }
 public String getPageTitle()
 {
     return driver.getTitle();
 }
 public boolean isSidebarDisplayed()
 {
     return getWebElement((By) sidebar).isDisplayed();

 }
 public void clickOnBloodgroupBtn()
 {
     WebElement bloodGroupElement= getWebElement((By) BloodGroupBtn);
 }
public  void clickOnNewBtn()
{
    //new button clicked
    getWebElement((By) NewBTnBloodGroup).click();
    //implicit wait
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
}




    //

















}
