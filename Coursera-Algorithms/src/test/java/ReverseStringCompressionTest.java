import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by swathi on 11/23/2015.
 */
public class ReverseStringCompressionTest {

    ReverseStringCompression s = new ReverseStringCompression();

    @Test
    public void testGetString() throws Exception {


        Assert.assertEquals(s.getString("s2wa4thi2"), "sswaaaathii");
        Assert.assertEquals(s.getString("s2"), "ss");
        Assert.assertEquals(s.getString(""), "");
        Assert.assertEquals(s.getString(" 3"), "   ");

        Assert.assertEquals(s.getString("") , "");

        Assert.assertEquals(s.getString("wat3"), "wattt");
        Assert.assertEquals(s.getString("wat3"), "wattt");

    }

}