import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CoingeckoPage {

    private WebDriver driver;
    public CoingeckoPage(WebDriver driver) {
        this.driver=driver;
    }

    By QANXpriceLocator=new By.ByCssSelector("span[data-coin-symbol='qanx']");

    public WebElement getQANXPrice(){
        WebDriverWait webDriverWait = new WebDriverWait(driver, 5);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(QANXpriceLocator));
        return driver.findElement(QANXpriceLocator);
    }
}
