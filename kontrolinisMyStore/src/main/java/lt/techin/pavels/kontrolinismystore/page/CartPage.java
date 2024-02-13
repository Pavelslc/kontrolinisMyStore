package lt.techin.pavels.kontrolinismystore.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
    @FindBy(css = ".product-line-info a")
    WebElement linkProductTitle;
    @FindBy (css = ".product-line-info.size .value")
    WebElement textProductSize;
    @FindBy (css = ".current-price .price")
    WebElement textProductPriceWithDiscount;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean isProductInCartByName(String productName) {
        return linkProductTitle.getText().equalsIgnoreCase(productName);
    }
    public boolean isProductInCartBySize (String productSize){
        return textProductSize.getText().equals(productSize);
    }
    public double getProductPriceWithDiscount(){
        return Double.parseDouble(textProductPriceWithDiscount.getText().replace("$",""));
    }
}
