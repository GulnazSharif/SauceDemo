package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewPage {

    WebDriver driver;
    By finishButton = By.id("finish");

    public OverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Нажали на кнопку Finish")
    public CompletePage clickFinish() {
        driver.findElement(finishButton).click();
        return new CompletePage(driver);
    }
}