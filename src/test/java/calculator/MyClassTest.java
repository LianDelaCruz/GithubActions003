package calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyClassTest {
    @Test
    public void testAdd() {
        System.out.println(">>> RUNNING MyClassTest");

        MyClass myClass = new MyClass();
        assertEquals(4, myClass.add(1, 2));
        assertEquals(0, myClass.add(-1, 1));
        assertEquals(0, myClass.add(0, 0));
    }
}
