import org.junit.Assert;
import org.junit.Test;
import org.testng.annotations.BeforeMethod;
import pages.PnUaComputers;
import pages.PnUaMain;
import utils.Drivers;

/**
 * Created by Администратор on 03.09.2017.
 */
public class PnUaTests extends BasePnUa{

    public PnUaTests() {
    }

    @BeforeMethod
    public void setUpPage() throws Exception{
        this.pnUaMain = new PnUaMain(Drivers.getDriver());
        this.pnUaComputers = new PnUaComputers(Drivers.getDriver());
    }

    @Test
    public void verifyServicesPresence () throws Exception{
        pnUaMain.openCompCategory();
        Assert.assertEquals("Ремонт и сервисное обслуживание", pnUaComputers.itServicesText());
    }

}
