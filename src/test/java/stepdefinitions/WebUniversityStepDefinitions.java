package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.WebuniPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class WebUniversityStepDefinitions {
    WebuniPage webuniPage =new WebuniPage();
    String ilksyfWHD;
    @Then("Login Portal gorununceye kadar asagi iner")
    public void login_portal_gorununceye_kadar_asagi_iner() {
        //kod yazilmadi
    }
    @Then("Login Portal butonuna tiklar")
    public void login_portal_butonuna_tiklar() {
        String ilksyfWHD = Driver.getDriver().getWindowHandle();
        webuniPage.loginPortalElement.click();
    }
    @Then("acilan ikinci window'a gecer")
    public void acilan_ikinci_window_a_gecer() {
    String ilksyfWHD = Driver.getDriver().getWindowHandle();
        ReusableMethods.switchToWindowHandle(Driver.getDriver().getWindowHandles());

    }
    @Then("Username kutusuna deger yazdirir")
    public void username_kutusuna_deger_yazdirir() {
    webuniPage.usernameBox.sendKeys(ConfigReader.getProperty("webUniUsername"));
    }
    @Then("Password kutusuna deger yazdirir")
    public void password_kutusuna_deger_yazdirir() {
    webuniPage.passwordBox.sendKeys(ConfigReader.getProperty("webUniPassword"));
    }
    @Then("webUniversity login butonuna basar")
    public void web_university_login_butonuna_basar() {
    webuniPage.loginButton.click();
    }
    @Then("Popup'ta cikan yazinin validation failed oldugunu test eder")
    public void popup_ta_cikan_yazinin_validation_failed_oldugunu_test_eder() {
        String expectedAlertYazi="validation failed";
        String actualAlertYazi= Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals(expectedAlertYazi,actualAlertYazi);
    }
    @Then("Ok diyerek Popup'i kapatir")
    public void ok_diyerek_popup_i_kapatir() {
        Driver.getDriver().switchTo().alert().accept();
    }

    @Then("Ilk sayfaya geri doner")
    public void ılk_sayfaya_geri_doner() {
    Driver.getDriver().switchTo().window(ilksyfWHD);
    }
    @Then("Ilk sayfaya donuldugunu test eder")
    public void ılk_sayfaya_donuldugunu_test_eder() {
    Assert.assertTrue(webuniPage.loginPortalElement.isDisplayed());
    }
    @Then("tum sayfalari kapatir")
    public void tum_sayfalari_kapatir() {
    Driver.quitDriver();
    }
}
