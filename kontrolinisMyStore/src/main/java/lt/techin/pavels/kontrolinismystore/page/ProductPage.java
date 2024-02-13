package lt.techin.pavels.kontrolinismystore.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class ProductPage extends BasePage {
    @FindBy(css = ".wishlist-button-add.wishlist-button-product")
    WebElement buttonAddToWishList;
    @FindBy(css = ".btn.btn-primary.add-to-cart")
    WebElement buttonAddToCart;
    @FindBy(css = ".modal-text")
    WebElement textNeedSingIn;
    @FindBy(css = ".show .btn-secondary")
    WebElement buttonCancelNeedSingIn;
    @FindBy(css = "#myModalLabel")
    WebElement textSuccessfulProductAdd;
    @FindBy(css = ".cart-content-btn .btn-primary")
    WebElement buttonProceedToCheckout;
    @FindBy(css = "[aria-label='Size']")
    WebElement selectorSize;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void clickButtonAddToWishList() {
        buttonAddToWishList.click();
    }

    public String getInfoMessageText() {
        return textNeedSingIn.getText();
    }

    public String getSuccessfulProductAddText() {
        wait.until(ExpectedConditions.visibilityOf(textSuccessfulProductAdd));
        return textSuccessfulProductAdd.getText().replace("", "");
    }

    public void clickButtonAddToCart() {
        buttonAddToCart.click();
    }

    public void clickButtonProceedToCheckout() {
        wait.until(ExpectedConditions.elementToBeClickable(buttonProceedToCheckout));
        buttonProceedToCheckout.click();
    }

    public void clickButtonCancelNeedSingIn() {
        buttonCancelNeedSingIn.click();
    }

    public void selectSize(String productSize) {
        Select select = new Select(selectorSize);
        select.selectByVisibleText(productSize);
    }


}
