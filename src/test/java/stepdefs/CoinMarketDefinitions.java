package stepdefs;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import static org.junit.Assert.assertTrue;

public class CoinMarketDefinitions {


    WebDriver driver;

   @Before
    @Given("^I am coinmarket page$")
    public void i_am_coinmarket_page() throws Exception {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://coinmarketcap.com/ ");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


    }

    @When("^I click on view all$")
    public void i_click_on_view_all() throws Exception {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.linkText("View All")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


    }

    @Then("^I verified (\\d+) results are displayed$")
    public void i_verified_results_are_displayed(int arg1) throws Exception {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        if (driver.getPageSource().contains("Next 100")) {
            System.out.println("Text is present");
        } else {
            System.out.println("Text is not present");
        }
        Thread.sleep(4000);
        driver.quit();


    }

    @When("^I am on the page I select (\\d+) crypto$")
    public void i_am_on_the_page_I_select_crypto(int arg1) throws Exception {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Bitcoin")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), \"Watch\")]")));
        driver.findElement(By.xpath("//span[contains(text(), \"Watch\")]")).click();
        driver.navigate().back();

        // Add another cryptocurrency Ethereum
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Ethereum")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebDriverWait waits = new WebDriverWait(driver, 30);
        waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), \"Watch\")]")));
        driver.navigate().back();

        // Add another cryptocurrency Bitcoin Cash
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.linkText("XRP")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebDriverWait waits1 = new WebDriverWait(driver, 30);
        waits1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), \"Watch\")]")));
        driver.navigate().back();

    }

    @Then("^I click on the Watchlist tab\\.$")
    public void i_click_on_the_Watchlist_tab() throws Exception {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Watchlist")).click();
        Thread.sleep(2000);

    }

    @And("^I check all options are added$")
    public void i_check_all_options_are_added() throws Exception {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        assertTrue(driver.getPageSource().contains("Bitcoin"));
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);



    }

    @When("^I click any of the three Full List options on this menu\\.$")
    public void i_click_any_of_the_three_Full_List_options_on_this_menu() throws Exception {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//span[.='Cryptocurrencies']")).click();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

    }
        @Before
        @Then("^I click any options and record data on current page$")
        public void i_click_any_options_and_record_data_on_current_page() throws Exception {
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.findElement(By.linkText("Top 100")).click();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            String innerText = driver.findElement(
                    By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[2]/div/div[2]/div[3]/div/table")).getText();
            System.out.println(innerText);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        }

    @Then("^I apply any combination of filters, displayed in the three dropdown menus above the tabs\\.$")
    public void i_apply_any_combination_of_filters_displayed_in_the_three_dropdown_menus_above_the_tabs() throws Exception {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[2]/div/div[1]/div[1]/button")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


    }
    @After
    @Then("^I check data record$")
    public void i_check_data_record() throws Exception {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String innerText = driver.findElement(
                By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[2]/div/div[3]/div[3]/div/table")).getText();
        System.out.println(innerText);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.close();


    }



}


