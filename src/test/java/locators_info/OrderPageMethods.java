package locators_info;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrderPageMethods extends OrderPageLocators{

    static WebDriver driver = MainPageMethods.driver;



    public void enterFirstName(String name){
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(firstName)).click();
        driver.findElement(firstName).sendKeys(name);
    }


    public void enterSecondName(String lastName){
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(firstName)).click();
        driver.findElement(secondName).sendKeys(lastName);
    }

    public void enterAdress(String adress){
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(secondName)).click();
        driver.findElement(adressToDeliver).sendKeys(adress);
    }

    public void chooseMetroStation(){
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(metro)).click();
        driver.findElement(metro).sendKeys("Выхино"+ Keys.DOWN+ Keys.ENTER);
    }

    public void enterPhoneNumber(String number){
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(metro)).click();
        driver.findElement(phoneNumber).sendKeys(number);
    }

    public void login(String name, String secondName, String adress, String number){
        enterFirstName(name);
        enterSecondName(secondName);
        enterAdress(adress);
        chooseMetroStation();
        enterPhoneNumber(number);

    }

    public void clickToProceed(){
        driver.findElement(buttonToProceed).click();
    }

    public void orderPageTearDown(){
        driver.quit();
    }
}
