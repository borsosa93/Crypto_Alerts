import com.google.common.math.Quantiles;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        double limit=0.094;

        final String projectRoot=System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",projectRoot+"\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.coingecko.com/en/coins/qanplatform");
        CoingeckoPage coingeckoPage=new CoingeckoPage(driver);
        String qanxPriceText;
        double qanxPrice;
        Scanner scanner=new Scanner(System.in);

        while(true){
        qanxPriceText=coingeckoPage.getQANXPrice().getText().split("\\$")[1];
        qanxPrice=Double.parseDouble(qanxPriceText);
        System.out.println(qanxPrice);
        if(qanxPrice>limit){
            break;
        }
        Thread.sleep(30000);
        driver.navigate().refresh();
        }


        while (true){
            java.awt.Toolkit.getDefaultToolkit().beep();
            Thread.sleep(1500);
        }

    }
}
