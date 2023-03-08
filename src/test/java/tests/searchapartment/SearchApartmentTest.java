package tests.searchapartment;

import org.testng.annotations.Test;
import tests.base.BaseTest;
import static constants.Constant.Urls.REALT_HOME_PAGE;
/**
 * Отвечает за сценарий выполнения нашего теста, наследуется от базового шаг 5
 */
public class SearchApartmentTest extends BaseTest {

    // Непосредственно сам сценарий проведения теста
    @Test
    public void checkIsRedirectToListing(){
        basePage.open(REALT_HOME_PAGE);

        realtHomePage
                .enterCountRooms()
                .enterSearch();

        realtListingPage.countCards();
    }
}
