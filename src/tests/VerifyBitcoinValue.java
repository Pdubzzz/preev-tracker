package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Home;
import tools.InputScanner;
import tools.Wait;


public class VerifyBitcoinValue {

    public static void main(String[] args) {

        InputScanner is = new InputScanner();
        //Convert min to seconds
        int time = is.setRunTime() * 60;
        int numOfCoins = is.setNumberofCoins();

        WebDriver driver = new ChromeDriver();

        Home h = new Home(driver);
        h.navigateToHomePage();
        h.setNumberOfCoins(numOfCoins);

        int btc = 0;

        for (int i = 0; i < time; i++){
            Wait w = new Wait();
            w.wait(1);

            if(btc != h.getBitCoinValue()){
                btc = h.getBitCoinValue();

                System.out.println("BTC VALUE OF " + numOfCoins + " COIN(S) IN USD: " + btc);
            }
        }

    }
    }
