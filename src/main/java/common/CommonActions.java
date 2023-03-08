package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.time.Duration;
import static common.Config.PLATFORM_AND_BROWSER;
import static constants.Constant.TimeoutVariable.IMPLICIT_WAIT;

/**
 * Создание логики драйвера 1 шаг
 */

public class CommonActions {

    // Метод который запускает драйвер(драйвер который нам нужем лежит в конфиге) выбором через switch case
    // В Default указываем, если такого драйвера нет
    public static  WebDriver createDriver() {
        WebDriver driver = null;
        
         switch (PLATFORM_AND_BROWSER){
             case "mac_chrome":
                 System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
                 driver = new ChromeDriver();
                 break;
             default:
                 Assert.fail("Incorrect platform or browser name: " + PLATFORM_AND_BROWSER);
         }
         // Задаем максимальное окно и неявное ожидание
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));
         return driver;
    }
}
