import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

/**
 * Created by swathi on 6/10/2015.
 */
public class BinaryChopTest {
    BinaryChop binaryChop = new BinaryChop();


    @Test
    public void testChop() {
        Assert.assertEquals(-1, binaryChop.iterativeChop(3, new int[]{}));
        Assert.assertEquals(-1, binaryChop.iterativeChop(3, new int[]{1}));
        Assert.assertEquals(0, binaryChop.iterativeChop(1, new int[]{1}));
        Assert.assertEquals(0, binaryChop.iterativeChop(1, new int[]{1, 3, 5}));
        Assert.assertEquals(1, binaryChop.iterativeChop(3, new int[]{1, 3, 5}));
        Assert.assertEquals(2, binaryChop.iterativeChop(5, new int[]{1, 3, 5}));
        Assert.assertEquals(-1, binaryChop.iterativeChop(0, new int[]{1, 3, 5}));
        Assert.assertEquals(-1, binaryChop.iterativeChop(2, new int[]{1, 3, 5}));
        Assert.assertEquals(-1, binaryChop.iterativeChop(4, new int[]{1, 3, 5}));
        Assert.assertEquals(-1, binaryChop.iterativeChop(6, new int[]{1, 3, 5}));
        Assert.assertEquals(0, binaryChop.iterativeChop(1, new int[]{1, 3, 5, 7}));
        Assert.assertEquals(1, binaryChop.iterativeChop(3, new int[]{1, 3, 5, 7}));
        Assert.assertEquals(2, binaryChop.iterativeChop(5, new int[]{1, 3, 5, 7}));
        Assert.assertEquals(3, binaryChop.iterativeChop(7, new int[]{1, 3, 5, 7}));
        Assert.assertEquals(-1, binaryChop.iterativeChop(0, new int[]{1, 3, 5, 7}));
        Assert.assertEquals(-1, binaryChop.iterativeChop(2, new int[]{1, 3, 5, 7}));
        Assert.assertEquals(-1, binaryChop.iterativeChop(4, new int[]{1, 3, 5, 7}));
        Assert.assertEquals(-1, binaryChop.iterativeChop(6, new int[]{1, 3, 5, 7}));
        Assert.assertEquals(-1, binaryChop.iterativeChop(8, new int[]{1, 3, 5, 7}));
    }

    @Test
    public void testChop2() {
        Assert.assertEquals(-1, binaryChop.ternaryOperationChop(3, new int[]{}));
        Assert.assertEquals(-1, binaryChop.recursiveChop(3, new int[]{1}));
            Assert.assertEquals(0, binaryChop.recursiveChop(1, new int[]{1}));
            Assert.assertEquals(0, binaryChop.recursiveChop(1, new int[]{1, 3, 5}));
            Assert.assertEquals(1, binaryChop.recursiveChop(3, new int[]{1, 3, 5}));
            Assert.assertEquals(2, binaryChop.recursiveChop(5, new int[]{1, 3, 5}));
            Assert.assertEquals(-1, binaryChop.recursiveChop(0, new int[]{1, 3, 5}));
            Assert.assertEquals(-1, binaryChop.recursiveChop(2, new int[]{1, 3, 5}));
            Assert.assertEquals(-1, binaryChop.recursiveChop(4, new int[]{1, 3, 5}));
            Assert.assertEquals(-1, binaryChop.recursiveChop(6, new int[]{1, 3, 5}));
            Assert.assertEquals(0, binaryChop.recursiveChop(1, new int[]{1, 3, 5, 7}));
            Assert.assertEquals(1, binaryChop.recursiveChop(3, new int[]{1, 3, 5, 7}));
            Assert.assertEquals(2, binaryChop.recursiveChop(5, new int[]{1, 3, 5, 7}));
            Assert.assertEquals(3, binaryChop.recursiveChop(7, new int[]{1, 3, 5, 7}));
            Assert.assertEquals(-1, binaryChop.recursiveChop(0, new int[]{1, 3, 5, 7}));
            Assert.assertEquals(-1, binaryChop.recursiveChop(2, new int[]{1, 3, 5, 7}));
            Assert.assertEquals(-1, binaryChop.recursiveChop(4, new int[]{1, 3, 5, 7}));
            Assert.assertEquals(-1, binaryChop.recursiveChop(6, new int[]{1, 3, 5, 7}));
            Assert.assertEquals(-1, binaryChop.recursiveChop(8, new int[]{1, 3, 5, 7}));
        }

    @Test
    public void testChop3() {
        Assert.assertEquals(-1, binaryChop.ternaryOperationChop(3,new int[]{}));
        Assert.assertEquals(-1, binaryChop.ternaryOperationChop(3, new int[]{1}));
        Assert.assertEquals(0, binaryChop.ternaryOperationChop(1, new int[]{1}));
        Assert.assertEquals(0, binaryChop.ternaryOperationChop(1, new int[]{1, 3, 5}));
        Assert.assertEquals(1, binaryChop.ternaryOperationChop(3, new int[]{1, 3, 5}));
        Assert.assertEquals(2, binaryChop.ternaryOperationChop(5, new int[]{1, 3, 5}));
        Assert.assertEquals(-1, binaryChop.ternaryOperationChop(0, new int[]{1, 3, 5}));
        Assert.assertEquals(-1, binaryChop.ternaryOperationChop(2, new int[]{1, 3, 5}));
        Assert.assertEquals(-1, binaryChop.ternaryOperationChop(4, new int[]{1, 3, 5}));
        Assert.assertEquals(-1, binaryChop.ternaryOperationChop(6, new int[]{1, 3, 5}));
        Assert.assertEquals(0, binaryChop.ternaryOperationChop(1, new int[]{1, 3, 5, 7}));
        Assert.assertEquals(1, binaryChop.ternaryOperationChop(3, new int[]{1, 3, 5, 7}));
        Assert.assertEquals(2, binaryChop.ternaryOperationChop(5, new int[]{1, 3, 5, 7}));
        Assert.assertEquals(3, binaryChop.ternaryOperationChop(7, new int[]{1, 3, 5, 7}));
        Assert.assertEquals(-1, binaryChop.ternaryOperationChop(0, new int[]{1, 3, 5, 7}));
        Assert.assertEquals(-1, binaryChop.ternaryOperationChop(2, new int[]{1, 3, 5, 7}));
        Assert.assertEquals(-1, binaryChop.ternaryOperationChop(4, new int[]{1, 3, 5, 7}));
        Assert.assertEquals(-1, binaryChop.ternaryOperationChop(6, new int[]{1, 3, 5, 7}));
        Assert.assertEquals(-1, binaryChop.ternaryOperationChop(8, new int[]{1, 3, 5, 7}));
    }
    }

















