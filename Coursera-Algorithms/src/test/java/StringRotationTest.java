import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by swathi on 11/23/2015.
 */
public class StringRotationTest {
    StringRotation s = new StringRotation();

    @Test
    public void testRotateString() throws Exception {
        Assert.assertEquals(s.rotateString(null , 1) , null);
        Assert.assertEquals(s.rotateString(" " , 1) , " ");
        Assert.assertEquals(s.rotateString("s" , 2) , "s");
        Assert.assertEquals(s.rotateString("swathi" , 1) , "wathis");
        Assert.assertEquals(s.rotateString("swathi" , 2) , "athisw");
        Assert.assertEquals(s.rotateString("swathi" , 3) , "thiswa");
        Assert.assertEquals(s.rotateString("swathi" , 4) , "hiswat");
        Assert.assertEquals(s.rotateString("swathi" , 5) , "iswath");
        Assert.assertEquals(s.rotateString("swathi" , 6) , "swathi");
        Assert.assertEquals(s.rotateString("swathi" , 7) , "wathis");
        Assert.assertEquals(s.rotateString("swathi" , 8) , "athisw");
        Assert.assertEquals(s.rotateString("swathi" , 9) , "thiswa");
        Assert.assertEquals(s.rotateString("swathi" , 10) , "hiswat");
        Assert.assertEquals(s.rotateString("swathi" , 11) , "iswath");
        Assert.assertEquals(s.rotateString("swathi" , 12) , "swathi");


    }
}