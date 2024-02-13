package lt.techin.pavels.kontrolinismystore.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductPage extends BasePage{
    @FindBy(css = ".wishlist-button-add.wishlist-button-product")
    WebElement buttonAddToWishList;
    @FindBy(css = ".btn.btn-primary.add-to-cart")
    WebElement buttonAddToCart;
    @FindBy (css = ".modal-text")
    WebElement textNeedSingIn;
    @FindBy(css = ".show .btn-secondary")
    WebElement buttonCancelNeedSingIn;
    @FindBy(css = "#myModalLabel")
    WebElement textSuccessfulProductAdd;
    @FindBy (css = ".cart-content-btn .btn-primary")
    WebElement buttonProceedToCheckout;
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void clickButtonAddToWishList() {
//        wait.until(ExpectedConditions.elementToBeClickable(buttonAddToWishList));
        buttonAddToWishList.click();
    }

    public String getInfoMessageText() {
//        wait.until(ExpectedConditions.visibilityOf(textSuccessfulProductAdd));
       return textNeedSingIn.getText();
    }
    public String getSuccessfulProductAddText (){
        textSuccessfulProductAdd.getText();
    }
}
