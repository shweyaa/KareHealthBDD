import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)


public class RegisterUser {


    public static WebDriver driver;

    String RegisterPageExpectedTitle="nopCommerce demo store. Register";
    String RegisterPageActualResult;
@BeforeAll
    public static void setup()
{

    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.navigate().to("http://demo.nopcommerce.com/");
    driver.manage().window().maximize();
    String getTitleHomePage= driver.getTitle();
    System.out.println("homePageTitle"+ getTitleHomePage);
}

@Test
    @Order(1)
public void Register()
{
    driver.findElement(By.linkText("Register")).click();
    RegisterPageActualResult= driver.getTitle();
    Assertions.assertEquals(RegisterPageExpectedTitle,RegisterPageActualResult);

   // System.out.println("Register Page Title:"+ RegisterPageTitle);
    driver.findElement(By.id("gender-female")).click();
    driver.findElement(By.id("FirstName")).sendKeys("Shweta");
    driver.findElement(By.id("LastName")).sendKeys("Pandey");
    Select day= new Select(driver.findElement(By.name("DateOfBirthDay")));
    day.selectByIndex(30);
    Select month=new Select(driver.findElement(By.name("DateOfBirthMonth")));
    month.selectByIndex(7);
    Select year=new Select(driver.findElement(By.name("DateOfBirthYear")));
    year.selectByValue("1985");
    driver.findElement(By.id("Email")).sendKeys("oppasqa@gmail.com");
    driver.findElement(By.id("Company")).sendKeys("Anetra Design Studio Pvt Ltd");
    driver.findElement(By.id("Newsletter")).click();
    driver.findElement(By.id("Password")).sendKeys("Anetra.ds");
    driver.findElement(By.id("ConfirmPassword")).sendKeys("Anetra.ds");
    driver.findElement(By.id("register-button")).click();
    String registrationPage=driver.findElement(By.className("result")).getText();
    System.out.println("The result is :"+ registrationPage);
    driver.findElement(By.cssSelector("a[class='button-1 register-continue-button']")).click();

}
@Test
@Order(2)
    public void selectProduct()
{

   WebElement computer= driver.findElement(By.linkText("Computers"));
   Actions act=new Actions(driver);
   act.moveToElement(computer).perform();
   driver.findElement(By.linkText("Notebooks")).click();
   String NotebookPageTitle= driver.getTitle();
    System.out.println("Notebook Page Title:"+ NotebookPageTitle);
   driver.findElement(By.linkText("Apple MacBook Pro 13-inch")).click();
   String ProductPageTitle= driver.getTitle();
    System.out.println("The page title is:"+ ProductPageTitle);
   driver.findElement(By.id("add-to-cart-button-4")).click();
   //driver.findElement(By.id("add-to-cart-button-4")).click();

}

@Test
@Order(3)
    public void shoppingCart()
{
    WebDriverWait wait=new WebDriverWait(driver,30);

    driver.findElement(By.linkText("Shopping cart")).click();
    Select giftWrapping=new Select(driver.findElement(By.id("checkout_attribute_1")));
    giftWrapping.selectByValue("2");
    driver.findElement(By.id("termsofservice")).click();
    driver.findElement(By.id("checkout")).click();
}

@Test
    @Order(4)
    public void shippingDetails()
{
    String shippingPageTitle= driver.getTitle();
    System.out.println("Shipping Page Title is :"+ shippingPageTitle);
    Select country= new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));
    country.selectByValue("233");
    driver.findElement(By.id("BillingNewAddress_City")).sendKeys("London");
    driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("18 francis road");
    driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("E10 6PW");
    driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("07503962222");
    driver.findElement(By.xpath("//button[@class='button-1 new-address-next-step-button']")).click();

    }
@Test
@Order(5)
    public void shippingMethod()
    {
      //driver.findElement(By.cssSelector("input#shippingoption_1")).click();
      //String ShippingMethodDescription=driver.findElement(By.cssSelector("input#shippingoption_1")).getText();
      //  System.out.println("shipping Method Description:"+ ShippingMethodDescription);
        driver.findElement(By.linkText("Back")).click();
    }
/*
@AfterAll
    public static void tearDown()
{
    driver.quit();
}

*/










}
