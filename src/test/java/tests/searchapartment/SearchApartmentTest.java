package tests.searchapartment;

import org.testng.annotations.Test;
import tests.base.BaseTest;
import static constants.Constant.Urls.REALT_HOME_PAGE;

public class SearchApartmentTest extends BaseTest {

    /**
     * Отвечает за сценарий выполнения нашего теста
     */
    @Test
    public void checkIsRedirectToListing(){
        basePage.open(REALT_HOME_PAGE);

        realtHomePage
                .enterCountRooms()
                .enterSearch();
        realtListingPage.countCards();
    }
}
