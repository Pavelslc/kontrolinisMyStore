package lt.techin.pavels.kontrolinismystore.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage extends BasePage{
    public SearchPage(WebDriver driver) {
        super(driver);
    }
    public boolean isProductDisplayed(String productName) {
        try {
            WebElement productTitle = driver.findElement(By.xpath("//a[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'" + productName.toLowerCase() + "')]"));
            actions.moveToElement(productTitle).perform();
//            wait.until(ExpectedConditions.visibilityOf(productTitle));
            return productTitle.isDisplayed();
        } catch (Exception ignored) {
            return false;
        }
    }
    public void clickProductName (String productName){
        driver.findElement(By.xpath("//a[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'" + productName.toLowerCase() + "')]")).click();
    }
}
