package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Администратор on 03.09.2017.
 */
public class Drivers {

    private static WebDriver driver;

    public static void setDriver (String driverType){

        switch (driverType){
            case "Chrome":
                driver = new ChromeDriver();
                break;
            case "Firefox":
                driver = new FirefoxDriver();
                break;
        }
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
