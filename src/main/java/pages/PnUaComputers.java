package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Clicker;

/**
 * Created by Администратор on 03.09.2017.
 */
public class PnUaComputers {
    WebDriver driver;
    Clicker clicker;

    public PnUaComputers(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //IT services presence verification
    public static final String IT_SERVICES = ".//*[@class = 'column-wrapper'][4]/article[3]/div/ul/li";
    @FindBy(xpath = IT_SERVICES)
    protected WebElement itServices;

    public String itServicesText (){
        String servicesText = itServices.getText();
        return servicesText;
    }

    public static final String neededText = "Ремонт и сервисное обслуживание";

}
