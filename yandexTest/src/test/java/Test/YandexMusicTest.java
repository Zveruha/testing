//package Test;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.testng.annotations.Test;
//@Test
//public class YandexMusicTest {
////    public static void main(String[] args) {
//public static String a = "https://music.yandex.ru/search?text=%D0%A4%D0%BE%D1%81%D1%84%D0%BE%D1%80";
////        WebDriver driver = new EdgeDriver();
////
////
////        driver.get("https://music.yandex.ru/");
////
////
////        WebElement searchButton = driver.findElement(By.xpath("/html/body/div[1]/div[12]/div/div/div[2]/div[2]/div/div[1]/button"));
////        searchButton.click();
////        WebElement searchBox = driver.findElement(By.xpath("/html/body/div[1]/div[12]/div/div/div[2]/div[2]/div/div[2]/div[1]/input"));
////        searchBox.sendKeys("Фосфор");
////
////        WebElement trackLink = driver.findElement(By.xpath("/html/body/div[1]/div[12]/div/div/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/a"));
////        trackLink.click();
////
////
////
////        driver.quit();
////    }
//
//    @Test
//    public static void main(String[] args) {
//
//        WebDriver driver = new EdgeDriver();
//
//
//        driver.get("https://music.yandex.ru/");
//
//
//        WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
//        searchButton.click();
//
//
//        WebElement searchBox = driver.findElement(By.xpath("//input[@class='d-input__field deco-input d-input__field_size-S deco-input_suggest']"));
//        searchBox.sendKeys("Фосфор");
//
//
//        driver.get(a);
//
//
//        driver.quit();
//    }
//}