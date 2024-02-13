package lt.techin.pavels.kontrolinismystore.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class HomePage extends BasePage {
    @FindBy(css = ".h3.product-title a")
    private List<WebElement> linkProductTitles;
    @FindBy(css = ".ui-autocomplete-input")
    WebElement inputSearch;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void enterSearch(String searchText) {
//        wait.until(ExpectedConditions.visibilityOf(inputSearch));
        inputSearch.sendKeys(searchText);
        inputSearch.sendKeys(Keys.ENTER);
    }

//    public boolean isProductDisplayed(String productName) {
//        try{
//            WebElement productTitle = driver.findElement(By.xpath("//a[contains(text(),'" + productName + "')]"));
//            actions.moveToElement(productTitle).perform();
////            wait.until(ExpectedConditions.visibilityOf(productTitle));
//            return productTitle.isDisplayed();
//        }catch (Exception ignored){
//            return false;
//        }
////        return linkProductTitles.stream().anyMatch(t -> t.getText().equals(productName));
//    }
}
