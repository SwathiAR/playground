import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by swathi on 11/20/2015.
 */
public class ReverseStringTest {



        ReverseString stringReverse = new ReverseString();

        @Test
        public void shouldReverseTheString(){

            Assert.assertEquals("swathi", stringReverse.reverseStringWithExtraMemory("ihtaws"));
            Assert.assertEquals("shruthi" , stringReverse.reverseStringWithExtraMemory("ihturhs"));
            Assert.assertEquals("chethan" , stringReverse.reverseStringWithExtraMemory("nahtehc"));
            Assert.assertEquals("" , stringReverse.reverseStringWithExtraMemory(""));

        }

    @Test
    public void shouldReverseString(){

        Assert.assertEquals("swathi", stringReverse.reverseStringWithoutExtraArray("ihtaws"));
        Assert.assertEquals("shruthi" , stringReverse.reverseStringWithoutExtraArray("ihturhs"));
        Assert.assertEquals("chethan" , stringReverse.reverseStringWithoutExtraArray("nahtehc"));
        Assert.assertEquals("" , stringReverse.reverseStringWithoutExtraArray(""));

    }


    @Test
    public void shdReverseString(){

        Assert.assertEquals("swathi", stringReverse.revereUsingRecursion("ihtaws"));
        Assert.assertEquals("shruthi" , stringReverse.revereUsingRecursion("ihturhs"));
        Assert.assertEquals("chethan" , stringReverse.revereUsingRecursion("nahtehc"));
        Assert.assertEquals("" , stringReverse.revereUsingRecursion(""));

    }

}