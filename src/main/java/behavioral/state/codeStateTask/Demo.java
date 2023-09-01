package behavioral.state.codeStateTask;

import static org.junit.Assert.assertEquals;

public class Demo {
    public static void main(String[] args) {

        CombinationLock cl = new CombinationLock(new int[]{1, 2, 3, 4});
//        assertEquals("LOCKED", cl.status);
//        cl.enterDigit(1);
//        assertEquals("1", cl.status);
//        cl.enterDigit(2);
//        assertEquals("12", cl.status);
//        cl.enterDigit(3);
//        assertEquals("123", cl.status);
//        cl.enterDigit(4);
//        assertEquals("OPEN", cl.status);
        assertEquals("LOCKED", cl.status);
        cl.enterBetterDigit(1);
        assertEquals("1", cl.status);
        cl.enterBetterDigit(2);
        assertEquals("12", cl.status);
        cl.enterBetterDigit(3);
        assertEquals("123", cl.status);
        cl.enterBetterDigit(4);
        assertEquals("OPEN", cl.status);
    }
}
