package selectors;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class Selector {
    public String currentPageUrl;
    public void webDR() {
        getWebDriver().manage().window().maximize();
    }
    public SelenideElement password = $(By.id("password"));

    public SelenideElement enterVal = $(By.name("q"));

    public void getWebDrive(String siteURL) {
        currentPageUrl = getWebDriver().getCurrentUrl();
    }
}
