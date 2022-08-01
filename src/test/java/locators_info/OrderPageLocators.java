package locators_info;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrderPageLocators {

    WebDriver driver = new ChromeDriver();
    MainPageLocators mainPageLocators = new MainPageLocators();

    // Поле "Имя"
    protected By name =By.xpath("//input[@placeholder='* Имя']");

    // Поле "Фамилия"
    // Поле "Адрес"
    // Поле "Станция метро"
    // Поле Телефон

    @Test
    public void testTest(){
        driver.get(mainPageLocators.getMainPage());
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(mainPageLocators.getCookie()));
        driver.findElement(mainPageLocators.getCookie()).click();
        driver.findElement(mainPageLocators.topOrderButton).click();
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(name)).click();
        driver.findElement(name).sendKeys("Тестовый текст");
    }

}
