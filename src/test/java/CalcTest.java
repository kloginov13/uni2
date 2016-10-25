import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Админ on 25.10.2016.
 */
public class CalcTest {
    private Calc calc;

    @Before
    public void initTest() {
        calc = new Calc();
    }

    @After
    public void afterTest() {
        calc = null;
    }
    @Test
    public void testGetSum() throws Exception {
        assertEquals(15, calc.getSum(7,8));
    }

    @Test
    public void testGetDivide() throws Exception {
        assertEquals(20, calc.getDivide(100,5));
    }

    @Test
    public void testGetMultiple() throws Exception {
        assertEquals(100, calc.getMultiple(50,2));
    }
}