package pages.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static constants.Constant.TimeoutVariable.EXPLICIT_WAIT;

/**
 *Создание базового класса от которго будут наследоваться остальные. Прописана общая логика
 *  для остальных классов 2 шаг
 */
public class BasePage {
    //Экземпляр драйвера создаем
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
    // Метод для открытия страницы
    public void open(String url){
        driver.get(url);
    }
    // Метод для ожидания видимости элемента
    public WebElement waitElementIsVisible (WebElement element){
        new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT)).until(ExpectedConditions.visibilityOf(element));
        return element;
    }
}
