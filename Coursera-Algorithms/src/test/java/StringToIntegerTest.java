import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by swathi on 11/21/2015.
 */
public class StringToIntegerTest {

   StringToInteger s = new StringToInteger();

    @Test
    public void testConvertSringToint() throws Exception {
        Assert.assertEquals(123 , s.convertSringToint("123"));
        Assert.assertEquals(-123 , s.convertSringToint("-123"));
        Assert.assertEquals(-1 , s.convertSringToint(null));
        Assert.assertEquals(-1 , s.convertSringToint(""));

    }

}