package Test;
import Page.Start;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class YandexMusicTest2 {
    private WebDriver driver;
    @BeforeTest
    public void setUp() throws InterruptedException {
        driver = new EdgeDriver();

    }

    @Test
    public void testSearchFunctionality() throws InterruptedException {

        int sec = 5;
        Duration duration = Duration.ofSeconds(sec);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        try {
            Start likesearch = new Start(driver).openPage().openPage2("https://passport.yandex.by/auth?origin=music_button-header&retpath=https%3A%2F%2Fmusic.yandex.by%2Fsettings%3Freqid%3D50359078817020437099224626634855331%26from-passport");
            likesearch.enterEmail("Zverrruha@yandex.by")
                    .clickSigButton();
            Thread.sleep(500);
            likesearch.enterPassword("Veravera0")
                    .clickSigButton();
            Thread.sleep(1000);
            likesearch.closeP().clickSearchBox()
                    .enterSearchKeyword("Фосфор");
            Thread.sleep(1000);
            likesearch.openPage3("https://music.yandex.by/search?text=%D1%84%D0%BE%D1%81%D1%84%D0%BE%D1%80")

                    .trackSelect();
            Thread.sleep(1000);
            likesearch.setLike();
            Thread.sleep(4000);
        }
        finally {
            driver.quit();
        }
    }

}

