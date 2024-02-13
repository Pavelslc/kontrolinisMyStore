package lt.techin.pavels.kontrolinismystore.test;

import lt.techin.pavels.kontrolinismystore.page.HomePage;
import lt.techin.pavels.kontrolinismystore.page.ProductPage;
import lt.techin.pavels.kontrolinismystore.page.SearchPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyStoreTest extends BaseTest {
    protected HomePage homePage;
    protected SearchPage searchPage;
    protected ProductPage productPage;

    @BeforeEach
    void HomeTestSetup() {
        homePage = new HomePage(driver);
        searchPage = new SearchPage(driver);
        productPage = new ProductPage(driver);

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/products.csv", numLinesToSkip = 1)
    void doesProductExist(String productName) {
        homePage.enterSearch(productName);
        assertTrue(searchPage.isProductDisplayed(productName), productName + " is not displayed");
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/products.csv", numLinesToSkip = 1)
    void addToWishListNeedLoginMessageShown(String productName) {
        assertTrue(searchPage.isProductDisplayed(productName), productName + " is not displayed");
        homePage.enterSearch(productName);
        searchPage.clickProductName(productName);
        productPage.clickButtonAddToWishList();
        String expectedInfoMessage = "You need to be logged in to save products in your wishlist.";
        String actualInfoMessage = productPage.getInfoMessageText();
        assertEquals(expectedInfoMessage, actualInfoMessage, "Expected to get a message: " + expectedInfoMessage);

    }
    @ParameterizedTest
    @CsvFileSource(resources = "/products.csv", numLinesToSkip = 2)
    void addToCartSuccessMessageShown (String productName){
        assertTrue(searchPage.isProductDisplayed(productName), productName + " is not displayed");
        homePage.enterSearch(productName);
        searchPage.clickProductName(productName);
        productPage.clickButtonAddToWishList();
        String expectedInfoMessage = "You need to be logged in to save products in your wishlist.";
        String actualInfoMessage = productPage.getInfoMessageText();
        assertEquals(expectedInfoMessage, actualInfoMessage, "Expected to get a message: " + expectedInfoMessage);

    }


}
