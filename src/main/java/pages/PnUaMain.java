package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Clicker;

import javax.xml.ws.WebServiceException;

/**
 * Created by Администратор on 03.09.2017.
 */
public class PnUaMain {

    private WebDriver driver;
    private Clicker clicker;

    public PnUaMain(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.clicker = new Clicker(driver);
    }

    // TEST 1 COMPUTER SURVICES INFO
    // Computer category opening
    public static final String COMP_CATEGOTY = ".//*[@class = 'h2 pc-block__head pc-block__head--computer']";


    // .//*[@class = 'pc-block'][1]/a

    @FindBy (xpath = COMP_CATEGOTY)
    protected WebElement compCategory;

    public void openCompCategory (){
        this.clicker.clickElement(this.compCategory);
    }

}
