import org.example.Main;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {

    @Test
    public void sumTest() {
        Assert.assertEquals(Main.sum(5,6), 11);
    }
    @Test
    public void minTest() {
        Assert.assertEquals(Main.min(8,6), 2);
    }
    @Test
    public void multTest() {
        Assert.assertEquals(Main.mult(5,6), 30);
    }
    @Test
    public void divTest() {
        Assert.assertEquals(Main.div(10,2), 5);
    }

    @Test
    public void stringTrimmerTest10() {
        Assert.assertEquals(Main.stringTrimmer("Привет всем кто живет на луне!", 10), "Привет все...");
    }

    @Test
    public void stringTrimmerTest21() {
        Assert.assertEquals(Main.stringTrimmer("Привет всем кто живет на луне!", 21), "Привет всем кто живет...");
    }

    @Test
    public void stringTrimmerTestMax() {
        Assert.assertEquals(Main.stringTrimmer("Привет всем кто живет на луне!", Integer.MAX_VALUE), "Привет всем кто живет на луне!");
    }

    @Test
    public void stringTrimmerTest0() {
        Assert.assertEquals(Main.stringTrimmer("Привет всем кто живет на луне!", 0), "...");
    }
}
