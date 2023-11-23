package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import page.FirstPage;
import page.SecondPage;
import page.ThirdPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private WebDriver driver;
    protected FirstPage mainPage;
    protected SecondPage mainPageSecond;
    protected ThirdPage mainPageThird;



    @BeforeMethod
    public void setDriver(){
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        mainPage = new FirstPage(driver);
        mainPageSecond = new SecondPage(driver);
        mainPageThird = new ThirdPage(driver);

    }

    @AfterMethod (alwaysRun = true)
    public void closeDriver(){
        driver.quit();
    }

}