import base.BasePage;
import org.junit.jupiter.api.Test;


public class SearchProducts extends BasePage

{
    @Test

public void searchProducts()
{
homepage.TextSearchButton(props.getProperty("product1"));
homepage.clickSearchButton();
}


}
