package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MPage {
    private final int WAIT_TIME_IN_SECONDS = 30;
    private static final String HOMEPAGE_URL = "https://cloud.google.com/";
    private final WebDriver driver;

    @FindBy(xpath = "//div[contains(@class,'devsite-searchbox')]")
    private WebElement searchButton;

    @FindBy(xpath = "//div[contains(@class,'devsite-searchbox')]/input")
    private WebElement searchInput;


    public MPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public MPage openPage() {
        driver.get(HOMEPAGE_URL);
        return this;
    }

    public ScResPage startSearch(String searchText) {
        searchButton.click();
        searchInput.sendKeys(searchText);
        searchInput.sendKeys(Keys.RETURN);
        return new ScResPage(driver);
    }

}
