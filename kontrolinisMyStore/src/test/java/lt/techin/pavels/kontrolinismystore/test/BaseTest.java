package lt.techin.pavels.kontrolinismystore.test;

import lt.techin.pavels.kontrolinismystore.page.HomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    protected WebDriver driver;


    @BeforeEach
    void setup(){
        driver = new ChromeDriver();
        driver.get("http://192.168.89.19/");
        driver.manage().window().maximize();


    }
    @AfterEach
    void driverQuit(){
        driver.quit();
    }
}
