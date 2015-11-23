
import org.testng.Assert;
import org.testng.annotations.Test;
/**
 * Created by swathi on 9/19/2015.
 */
public class BinaryCalculatorTest {
    BinaryCalculator bc = new BinaryCalculator();

    @Test
    public void test_1() {
        Assert.assertEquals("10", BinaryCalculator.calculate("1", "1", "add"));
    }

    @Test
    public void test_2() {
        Assert.assertEquals("0", BinaryCalculator.calculate("1", "1", "subtract"));
    }

    @Test
    public void test_3() {
        Assert.assertEquals("1", BinaryCalculator.calculate("1", "1", "multiply"));
    }

    @Test
    public void test_4() {
//        Assert.assertEquals("0", BinaryCalculator.calculate("1", "0", "multiply"));
//        Assert.assertEquals(BinaryCalculator.calculate("1", "1", "add"), "10");
//        Assert.assertEquals(BinaryCalculator.calculate("111", "101", "add"), "1100");
//        Assert.assertEquals(BinaryCalculator.calculate("0", "11", "add"), "11");
//        Assert.assertEquals(BinaryCalculator.calculate("111", "11", "subtract"), "100");
//        Assert.assertEquals(BinaryCalculator.calculate("1", "1", "subtract"), "0");
//        Assert.assertEquals(BinaryCalculator.calculate("1", "11", "subtract"), "-10");
        Assert.assertEquals(BinaryCalculator.calculate("1", "-11", "add"), "-10");
        Assert.assertEquals(BinaryCalculator.calculate("1", "1", "multiply"), "1");
        Assert.assertEquals(BinaryCalculator.calculate("-1", "1", "multiply"), "-1");
        Assert.assertEquals(BinaryCalculator.calculate("-1", "-1", "multiply"), "1");
        Assert.assertEquals(BinaryCalculator.calculate("0", "1111", "multiply"), "0");
        Assert.assertEquals(BinaryCalculator.calculate("0", "0", "multiply"), "0");
        Assert.assertEquals(BinaryCalculator.calculate("-100", "11", "multiply"), "-1100");
        Assert.assertEquals(BinaryCalculator.calculate("11", "11", "multiply"), "1001");}
    
    

}