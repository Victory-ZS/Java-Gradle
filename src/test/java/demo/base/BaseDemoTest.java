package demo.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseDemoTest {

    @Test
    public void should_return_hello_world() {
        BaseDemo baseDemo = new BaseDemo();

        String expected = "Hello World";

        assertEquals(expected, baseDemo.print());
    }

    @Test
    public void should_return_sum_1(){
        BaseDemo baseDemo = new BaseDemo();

        int num1 = 1, num2 = 2;
        int num3 = num1 + num2;

        assertEquals(num3, baseDemo.sum(num1, num2));
    }

    @Test
    public void should_return_sum_2(){
        BaseDemo baseDemo = new BaseDemo();

        int num1 = -2, num2 = 3;

        assertEquals(num1 + num2, baseDemo.sum(num1, num2));
    }

}
