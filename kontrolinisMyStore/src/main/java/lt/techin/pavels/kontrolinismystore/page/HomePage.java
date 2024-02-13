package lt.techin.pavels.kontrolinismystore.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {

    @FindBy(css = ".ui-autocomplete-input")
    WebElement inputSearch;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void enterSearch(String searchText) {
        inputSearch.sendKeys(searchText);
        inputSearch.sendKeys(Keys.ENTER);
    }
}
