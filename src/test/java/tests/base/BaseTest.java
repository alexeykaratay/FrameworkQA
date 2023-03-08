package tests.base;

import common.CommonActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import pages.base.BasePage;
import pages.listing.RealtListingPage;
import pages.realt_home.RealtHomePage;
import static common.Config.CLEAR_COOKIES_AND_STORAGE;
import static common.Config.HOLD_BROWSER_OPEN;

/**
 *Базовый класс для всех тестов несущий основную логику шаг 4
 */
public class BaseTest {
    // Создаем драйвер через метод createDriver
    protected WebDriver driver = CommonActions.createDriver();
    // Создаем экземпляр базвого класса страниц и отдаем ей драйвер созданный
    protected BasePage basePage = new BasePage(driver);
    //Создаем экземпляр самой страницы и отдаем ей драйвер
    protected RealtHomePage realtHomePage = new RealtHomePage(driver);
    //Экземпляр второй страницы, чтобы с ней работать
    protected RealtListingPage realtListingPage = new RealtListingPage(driver);


    //Clear cookie and storage after test
    @AfterTest
    public void clearCookiesAndLocalStorage(){
        if (CLEAR_COOKIES_AND_STORAGE){
            JavascriptExecutor javascriptException = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptException.executeScript("window.sessionStorage.clear()");
        }
    }
    //Close browser after test
    @AfterSuite(alwaysRun = true)
    public void close(){
        if (HOLD_BROWSER_OPEN){
            driver.quit();
        }
    }

}
