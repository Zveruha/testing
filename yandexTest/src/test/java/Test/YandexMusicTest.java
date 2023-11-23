package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class YandexMusicTest {
    public static void main(String[] args) {
        // Установите путь к драйверу Chrome


        // Создайте экземпляр драйвера Chrome
        WebDriver driver = new EdgeDriver();

        // Откройте https://music.yandex.ru/
        driver.get("https://music.yandex.ru/");

        // Нажмите кнопку поиска и введите название трека в поле поиска.
        WebElement searchButton = driver.findElement(By.xpath("/html/body/div[1]/div[12]/div/div/div[2]/div[2]/div/div[1]/button"));
        searchButton.click();
        WebElement searchBox = driver.findElement(By.xpath("/html/body/div[1]/div[12]/div/div/div[2]/div[2]/div/div[2]/div[1]/input"));
        searchBox.sendKeys("Фосфор");

        WebElement trackLink = driver.findElement(By.xpath("/html/body/div[1]/div[12]/div/div/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/div[3]/div[2]/a"));
        trackLink.click();



        driver.quit();
    }
}