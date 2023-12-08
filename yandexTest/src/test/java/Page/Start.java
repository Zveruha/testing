package Page;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;

public class Start extends AbstractPage {
    private static final String HOMEPAGE_URL ="https://music.yandex.by/home";

    public Start(WebDriver driver) {
        super(driver);
    }

    public Start openPage() {
        super.driver.get(HOMEPAGE_URL);
        return this;
    }

   public Start openPage2(String u){
       super.driver.get(u);
       return this;
    }

    public Start openPage3(String u){
        super.driver.get(u);
        return this;
    }

    public Start closeP(){
        cl.click();
        return this;
    }


    @FindBy(xpath = "//button[@class='d-button deco-button deco-button-transparent d-button_rounded d-button_w-icon d-button_w-icon-centered fullscreen-popup__close js-close test-fullscreen-close']")
    private WebElement cl;
    @FindBy(xpath = "//input[@placeholder='Логин или email']")
    private WebElement emailElem;

    @FindBy(xpath = "//input[@placeholder='Введите пароль']")
    private WebElement passwordElem;

    @FindBy(id="passp:sign-in")
    private WebElement siginbut;

    @FindBy(xpath = "//a[@class='button button_size_L head-kids__button_login button_action log-in not-handled']")
    private WebElement loginButton;

    @FindBy(xpath = "//button[@class='d-button deco-button deco-button-flat d-button_type_flat d-button_w-icon d-button_w-icon-centered d-search__button']")
    private WebElement searchBox;
    @FindBy(xpath = "//input[@placeholder='Трек, альбом, исполнитель, подкаст']")
    private WebElement networkButn;

    @FindBy(xpath = "//a[class='d-link deco-link d-suggest__all-results typo deco-popup-suggest-menu__border_top d-suggest__item d-suggest__item_low d-link_arrow deco-link_arrow d-link_muted deco-link_muted d-link_no-hover-color deco-link_no-hover-color deco-pane_show-hover-pressed']")
    private WebElement result;

    @FindBy(xpath = "//div[@class='d-track typo-track d-track_selectable d-track_with-cover d-track_in-lib']")
    private WebElement track;

    @FindBy(xpath = "/html/body/div[1]/div[14]/div[3]/div/div[3]/div/div[1]/div[2]/span[2]/button")
    private WebElement like;

    public Start clickSearchBox() {
        searchBox.click();
        return  this;

    }


    public Start enterSearchKeyword(String keyword) {

        networkButn.sendKeys(keyword);
        return  this;

    }

    public Start trackSelect(){
        track.click();
        return this;
    }

    public Start setLike(){
        like.click();
        return this;
    }

    public Start SearchResults() {
        result.click();
        return this;
    }
    public Start enterEmail(String email) {
        emailElem.sendKeys(email);
        return  this;
    }

    public Start enterPassword(String password) {
        passwordElem.sendKeys(password);
        return  this;
    }



    public Start clickSigButton() {
        siginbut.click();
        return  this;
    }


}
