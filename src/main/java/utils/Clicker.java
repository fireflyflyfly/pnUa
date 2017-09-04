package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.xml.ws.WebServiceException;

/**
 * Created by Администратор on 03.09.2017.
 */
public class Clicker {

    public WebDriver driver;

    public Clicker(WebDriver driver){
        this.driver = driver;
    }

    public void clickElement (WebElement wElement){
        try {
            wElement.click();
        }
        catch (WebServiceException noClick){
            noClick.printStackTrace();
        }
    }

}
