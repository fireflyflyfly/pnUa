import org.eclipse.jetty.websocket.common.events.EventDriverFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.PnUaComputers;
import pages.PnUaMain;
import utils.Config;
import utils.Drivers;

/**
 * Created by Администратор on 03.09.2017.
 */
public class BasePnUa extends Config{

    PnUaMain pnUaMain;
    PnUaComputers pnUaComputers;

    public BasePnUa(){
    }

    @BeforeMethod
    public void setUp() throws Exception {
        Drivers.setDriver(browserType);
        Drivers.getDriver().get(startingAddress);
    }


    @AfterMethod
    public void tearDown() throws Exception {
        Drivers.getDriver().quit();
    }
}
