package pageObject;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends BasePage {
    WebDriver driver;
    @FindBy(id="gender-male")
    public WebElement genderMale;

    @FindBy(id="gender-female")
    public WebElement genderFemale;

    @FindBy(id="FirstName")
    public WebElement firstName;

    @FindBy(id="LastName")
    public WebElement lastName;

    @FindBy (name = "DateOfBirthDay")
    public WebElement dateDropdown;

    @FindBy (name = "DateOfBirthMonth")
    public WebElement monthDropdown;

    @FindBy (name = "DateOfBirthYear")
    public WebElement yearDropdown;

    @FindBy(id = "Email")
    public WebElement email;

    @FindBy(id = "Company")
    public WebElement company;

    @FindBy(id= "Newsletter")
    public WebElement newsletter;

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy(id="ConfirmPassword")
    public WebElement confirmPassword;

    @FindBy (id="register-button")
    public  WebElement registerButton;

   //constructor
    public RegisterPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    // actions

    public void clickGenderMaleRadioBtn()
    {
        genderMale.click();
    }
    public void clickGenderFemaleRadioBtn()
    {
        genderFemale.click();
    }

    public void enterFirstName()
    {
        firstName.sendKeys(prop.getProperty("Fname1"));

    }
    public void enterLastName()
    {
        lastName.sendKeys((prop.getProperty("LName1")));
    }

    public void selectDate()
    {
        Select day= new Select(dateDropdown);
        day.selectByValue(prop.getProperty("date1"));

    }
    public void selectMonth()
    {
        Select month= new Select(monthDropdown);
        month.selectByValue(prop.getProperty("month1"));
    }
    public void selectYear()
    {
        Select year= new Select(yearDropdown);
        year.selectByValue(prop.getProperty("year1"));
    }

    public void enterEmail()
    {
        email.sendKeys(prop.getProperty("email1"));
    }

    public void company()
    {
        company.sendKeys(prop.getProperty("company1"));
    }

    public void setNewsletter()
    {
        newsletter.click();
    }

    public void enterPassword()
    {
        password.sendKeys(prop.getProperty("password1"));
    }
    public void enterConfirmPassword()
    {
        confirmPassword.sendKeys(prop.getProperty("password1"));
    }
    public void enterRegisterBtn()
    {
        registerButton.click();
    }





}
