package tests;

import locators_info.MainPageMethods;
import locators_info.OrderPageMethods;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestingOrders {
    OrderPageMethods orderPageMethods = new OrderPageMethods();
    MainPageMethods mainPageMethods = new MainPageMethods();


    @Before
    public void SetUp(){
        mainPageMethods.mainPageSetUp();
        mainPageMethods.clickToTopOrderButton();
    }

    @Test
    public void topOrderButtonCreatingOrderWithPositiveScenario(){
        orderPageMethods.login("Тестоовое имя", "Тестовая Фамилия", "Тестовый адрес", "98989898989");
        orderPageMethods.clickToProceed();
    }

    @After
    public void TearDown(){
        orderPageMethods.orderPageTearDown();
    }
}
