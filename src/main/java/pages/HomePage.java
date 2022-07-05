package pages;

import io.netty.buffer.ByteBufAllocatorMetric;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage extends BasePage {

    private String url;
    private WebElement btnIzdavanje;

    public HomePage(WebDriver driver) {
        super(driver);
        this.url = super.url;
    }

    public WebElement getBtnIzdavanje(){
        return driver.findElement(By.xpath("////div[2]/ul/li[2]/a"));
    }


    public void OpenHomePage() {
        driver.get(url);
        driver.manage().window().maximize();
    }
    public void clickIzdavanje(){
        WebElement btnIzdavanje = this.getBtnIzdavanje();
        btnIzdavanje.click();

    }


    public WebElement getIzdavanjePageTitle() {
        return driver.findElement(By.xpath("//*[@id=\"titlebar\"]/div/div/h1"));
    }
}
