package pages.realt_home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class RealtHomePage extends BasePage {

    public RealtHomePage(WebDriver driver) {
        super(driver);
    }

    private final By countRooms = By.id("rooms");
    private final By option2Rooms = By.xpath("//select[@id='rooms']/option[@value=2]");
    private final By serchBtn = By.xpath("//div[@id='residentialInputs']//a[text()='Найти']");

    public RealtHomePage enterCountRooms(){
        driver.findElement(countRooms).click();
        driver.findElement(option2Rooms).click();

        return this;
    }

    public RealtHomePage enterSearch(){
        WebElement btnFind = driver.findElement(serchBtn);
        waitElementIsVisible(btnFind).click();

        return this;
    }
}
