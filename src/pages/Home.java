package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.*;
import sun.jvm.hotspot.debugger.Page;

public class Home {

    WebDriver driver = null;

    @FindBy(id = "numField")
    private WebElement btcValue;

    @FindBy(id = "invField")
    private WebElement numOfCoins;


    public Home(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateToHomePage() {
        String URL = "https://preev.com/";
        System.out.println("Navigating to: " + URL);
        driver.get(URL);

    }

    public int getBitCoinValue() {
        int title = Integer.parseInt(driver.getTitle().split(" ")[0].replace(",",""));
        return title;
    }

    public void setNumberOfCoins(int numberOfCoins){
        numOfCoins.sendKeys(Integer.toString(numberOfCoins));
    }


}
