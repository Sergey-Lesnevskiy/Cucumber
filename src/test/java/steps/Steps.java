package steps;

import io.cucumber.java.ru.Допустим;
import io.cucumber.java.ru.Тогда;
import org.openqa.selenium.By;
import selectors.Selector;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Steps {
    Selector selector = new Selector();

    @Допустим("^открыта страница \"([^\"]*)\"$")
    public void openThePage(String pageURL) {
        open(pageURL);
        selector.webDR();//я изменил , но до этого была 1 строчка и так 1 строчка
        String currentPageUrl = getWebDriver().getCurrentUrl();
        assertEquals(pageURL, currentPageUrl, "значения ссылок не совподают");
    }

    @Допустим("^в строку UserName ввели значение \"([^\"]*)\"$")
    public void EnterUsername(String name) {
        $(By.id("user-name")).setValue(name);
    }

    @Допустим("^в строку Password ввели значение \"([^\"]*)\"$")
    public void EnterPassword(String password) {
        selector.password.setValue(password);
    }

    @Допустим("нажата кнопка \"([^\"]*)\"$")
    public void clickOnButton(String text) {
        $(By.cssSelector("input[value='" + text + "']")).click();
    }

    @Тогда("открывается страница выбора товаров \"([^\"]*)\"$")
    public void openlink(String siteURL) {
        selector.getWebDrive(siteURL);
        assertEquals(siteURL, selector.currentPageUrl, "значения ссылок не совподают");
    }

    @Допустим("^в строку поиска ввели значение \"([^\"]*)\"$")
    public void enterValue(String text) {
        selector.enterVal.setValue(text);
    }

    @Тогда("^первая ссылка называется \"([^\"]*)\"$")
    public void checkLinkName(String link) {
        String actualLinkText = $$(".g .LC20lb.DKV0Md").get(0).getText();
        assertEquals(link, actualLinkText, "название ссылок не совпадают");
    }

    @Тогда("^выполнено нажатие на ссылку \"([^\"]*)\"$")
    public void clickOnLink(String link) {
        $(By.xpath("//*[contains(text(), \"" + link + "\")]")).click();
    }

    @Тогда("^выполнено нажатие на ссылку товара\"([^\"]*)\"$")
    public void clickOnLinkProducts(String link) {

        $(By.xpath("//div[text()=\"" + link + "\"]")).click();
    }

    @Тогда("^открывается сайт \"([^\"]*)\"$")
    public void openLink(String siteURL) {
        selector.getWebDrive(siteURL);
        assertEquals(siteURL, selector.currentPageUrl, "Значения ссылок не сопадают");
    }

    @Тогда("^цена товара равна \"([^\"]*)\"$")
    public void checkGadgetPrice(String price) {
        String actualPriceInfo = $(By.cssSelector("div[class='inventory_details_price']")).getText();
        assertTrue(actualPriceInfo.contains(price), "Актуальная и ожидаемая цена не совпадают");
    }

    @Допустим("^выполнено нажатие на кнопку \"([^\"]*)\"$")
    public void clickOnTheButton(String string) {
        $(By.xpath("//button[@name='add-to-cart-sauce-labs-backpack'][text()=\"" + string + "\"]")).click();
    }

    @Тогда("кликаем на иконку корзины")
    public void clickOnTheCart() {
        $("a[class='shopping_cart_link']").click();
    }

    @Тогда("^переходим на страницу \"([^\"]*)\"$")
    public void goToPage(String siteURL) {
        selector.getWebDrive(siteURL);
        assertEquals(siteURL, selector.currentPageUrl, "значения ссылок не совподают");
    }

    @Тогда("^проверяем наличие товара в корзине \"([^\"]*)\"$")
    public void checkProduct(String product) {
        String text = $(By.xpath("//div[@class='inventory_item_name']")).getText();
        assertEquals(product, text, "значения не совпадают");
    }

    @Допустим("кликаем на кнопку Checkout \"([^\"]*)\"$")
    public void clickOnTheButtonCheckout(String string) {
        $(By.xpath("//button[@data-test='checkout'][text()=\"" + string + "\"]")).click();
    }

    @Допустим("вводим в поля данные \"([^\"]*)\"$")
    public void enterData(String data) {
        $("#first-name").sendKeys(data);
        $("#last-name").sendKeys(data);
        $("#postal-code").sendKeys(data);
    }

    @Допустим("кликаем на кнопку Continue \"([^\"]*)\"$")
    public void clickOnTheButtonContinue(String value) {
        $(By.cssSelector("[value=\"" + value + "\"]")).click();
    }

    @Допустим("кликаем на кнопку Finish \"([^\"]*)\"$")
    public void clickOnTheButtonFinish(String finish) {
        $(By.xpath("//button[text()=\"" + finish + "\"]")).click();
    }

    @Допустим("переходим на страницу THANK YOU FOR YOUR ORDER \"([^\"]*)\"$")
    public void goToThePageTHANKYOUFORYOURORDER(String pageURL) {
        String page = getWebDriver().getCurrentUrl();
        assertEquals(page, pageURL, "значение ссылок не совподают");
    }

}