package New_JAva_Project.diares.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Locators
    @FindBy(xpath = "//*[contains(@href,'about-us')]")
    private WebElement aboutUsLink;

    @FindBy(linkText = "Contact Us")
    private WebElement contactUsLink;

    // Methods
    public void clickAboutUs() {
        aboutUsLink.click();
    }

    public void clickContactUs() {
        contactUsLink.click();
    }
}


