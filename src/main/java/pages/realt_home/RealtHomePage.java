package pages.realt_home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

/**
 * Класс для главной страницы откуда мы начинаем, наследуемся от базового класса 3 шаг
 */

public class RealtHomePage extends BasePage {
    // Конструктор вызываем обязательно создавая экземпляр драйвера
    public RealtHomePage(WebDriver driver) {
        super(driver);
    }
    // Переменные с адресами элементов с которыми мы работаем
    private final By countRooms = By.id("rooms");
    private final By option2Rooms = By.xpath("//select[@id='rooms']/option[@value=2]");
    private final By serchBtn = By.xpath("//div[@id='residentialInputs']//a[text()='Найти']");

    //Метод для логики поиска элемента и клика
    public RealtHomePage enterCountRooms(){
        driver.findElement(countRooms).click();
        driver.findElement(option2Rooms).click();

        return this;
    }
    // Метод для кнопки "Найти" изолированный если понадобятся другие данные из прошлого метода
    public RealtHomePage enterSearch(){
        WebElement btnFind = driver.findElement(serchBtn);
        waitElementIsVisible(btnFind).click();

        return this;
    }
}
