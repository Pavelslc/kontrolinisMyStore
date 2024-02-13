package lt.techin.pavels.kontrolinismystore.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage{
    @FindBy (css = ".product-line-info a")
    List<WebElement> linkProductTitles;
//    @FindBy (css = "//span[text()='"+productSize+"']")
    public CartPage(WebDriver driver) {
        super(driver);
    }
}
