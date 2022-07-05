import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class VerifyPageIzdavanjeIsOpened extends BaseTest {
    @Test
    public void VerifyIzdavanjePage() {
        HomePage homePage = new HomePage(driver);
        homePage.OpenHomePage();
        homePage.clickIzdavanje();
        String actualIzdavanjePageTitle = homePage.getIzdavanjePageTitle().getText();
        Assert.assertEquals(actualIzdavanjePageTitle,"Izdavanje stanova");
    }
}
