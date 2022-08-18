package base;

import PropertiesFile.PropertiesUtility;
import org.junit.Before;

import java.util.HashMap;

public class Hooks extends BaseTest {

    public HashMap<String, String> TestData;

    @Before
    public void PrepareEnvironment(){
        String className = this.getClass().getSimpleName();
        PropertiesUtility propertiesUtility = new PropertiesUtility(className);
        TestData = propertiesUtility.GetAllKeyValues();
    }
}
