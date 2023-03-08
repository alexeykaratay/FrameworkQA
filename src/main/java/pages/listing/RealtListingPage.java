package pages.listing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;

import static constants.Constant.Quantity.NUMBER_OF_ADS;

public class RealtListingPage extends BasePage {

    public RealtListingPage(WebDriver driver) {
        super(driver);
    }

    private final By card = By.xpath("//div[@data-mode='3']");

    /**
     * Подсчитывает кол-во объявлений их 20 в открывшемся окне после сценария
     */
    public RealtListingPage countCards(){
        int countCard = driver.findElements(card).size();
        Assert.assertEquals(countCard, NUMBER_OF_ADS);
        return this;
    }





}
