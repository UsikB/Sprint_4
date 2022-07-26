package locators_info;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.*;

public class MainPageMethods {

    MainPageLocators mainPageLocators = new MainPageLocators();
    WebDriver driver = new ChromeDriver();


    public void setUp(){
        driver.get(mainPageLocators.getMainPage());
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(mainPageLocators.getCookie()));
        driver.findElement(mainPageLocators.getCookie()).click();
    }

    public void testDropDownQuestionAnswer1() {
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOfElementLocated(mainPageLocators.list1));
        WebElement element = driver.findElement(mainPageLocators.list1);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOfElementLocated(mainPageLocators.textOfList1));
        String actual = driver.findElement(mainPageLocators.textOfList1).getText();
        String expected = mainPageLocators.answerOfList1;
        assertEquals("Не совпадает",expected, actual);
    }

    public void testDropDownQuestionAnswer2() {
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOfElementLocated(mainPageLocators.list1));
        WebElement element = driver.findElement(mainPageLocators.list2);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOfElementLocated(mainPageLocators.textOfList2));
        String actual = driver.findElement(mainPageLocators.textOfList1).getText();
        String expected = mainPageLocators.answerOfList2;
        assertEquals("Не совпадает",expected, actual);
    }

    public void testDropDownQuestionAnswer3() {
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOfElementLocated(mainPageLocators.list1));
        WebElement element = driver.findElement(mainPageLocators.list3);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOfElementLocated(mainPageLocators.textOfList3));
        String actual = driver.findElement(mainPageLocators.textOfList1).getText();
        String expected = mainPageLocators.answerOfList3;
        assertEquals("Не совпадает",expected, actual);
    }

    public void testDropDownQuestionAnswer4() {
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOfElementLocated(mainPageLocators.list1));
        WebElement element = driver.findElement(mainPageLocators.list4);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOfElementLocated(mainPageLocators.textOfList4));
        String actual = driver.findElement(mainPageLocators.textOfList1).getText();
        String expected = mainPageLocators.answerOfList4;
        assertEquals("Не совпадает",expected, actual);
    }

    public void testDropDownQuestionAnswer5() {
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOfElementLocated(mainPageLocators.list1));
        WebElement element = driver.findElement(mainPageLocators.list5);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOfElementLocated(mainPageLocators.textOfList5));
        String actual = driver.findElement(mainPageLocators.textOfList1).getText();
        String expected = mainPageLocators.answerOfList5;
        assertEquals("Не совпадает",expected, actual);
    }

    public void testDropDownQuestionAnswer6() {
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOfElementLocated(mainPageLocators.list1));
        WebElement element = driver.findElement(mainPageLocators.list6);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(mainPageLocators.textOfList6));
        String actual = driver.findElement(mainPageLocators.textOfList1).getText();
        String expected = mainPageLocators.answerOfList6;
        assertEquals("Не совпадает",expected, actual);
    }

    public void testDropDownQuestionAnswer7() {
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOfElementLocated(mainPageLocators.list1));
        WebElement element = driver.findElement(mainPageLocators.list7);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(mainPageLocators.textOfList7));
        String actual = driver.findElement(mainPageLocators.textOfList1).getText();
        String expected = mainPageLocators.answerOfList7;
        assertEquals("Не совпадает",expected, actual);
    }

    public void testDropDownQuestionAnswer8() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(mainPageLocators.list1));
        WebElement element = driver.findElement(mainPageLocators.list8);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(mainPageLocators.textOfList8));
        String actual = driver.findElement(mainPageLocators.textOfList1).getText();
        String expected = mainPageLocators.answerOfList8;
        assertEquals("Не совпадает",expected, actual);
    }

    public void tearDown(){
        driver.quit();
    }


}