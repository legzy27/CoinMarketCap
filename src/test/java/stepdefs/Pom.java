package stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;


public class Pom {


    private static WebDriver driver = null;

    public static void main(String[] args) {

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://coinmarketcap.com/");

        CoinMarketDefinitions homepage = PageFactory.initElements(driver, CoinMarketDefinitions.class);
    }

}
