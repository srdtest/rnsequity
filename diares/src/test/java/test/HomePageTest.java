package test;



import org.testng.Assert;
import org.testng.annotations.Test;

import New_JAva_Project.diares.pages.HomePage;


public class HomePageTest extends BaseTest {

    @Test(priority=0)
    public void verifyHomePageTitle() {
        String expectedTitle = "About us – RNS Equity";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title mismatch");
    }

    @Test
    public void navigateToAboutUsPage() {
        HomePage homePage = new HomePage(driver);
        homePage.clickAboutUs();
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("/about-us"));
    }
}
