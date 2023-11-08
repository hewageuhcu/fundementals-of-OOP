package org.example;
import org.example.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;
public class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    public void testAdd() {
        Assert.assertEquals(calculator.add(3, 2), 5);
    }
    @Test
    public void testSubtract() {
        Assert.assertEquals(calculator.subtract(3, 2), 1);
    }
    @Test
    public void testMultiply() {
        Assert.assertEquals(calculator.multiply(3, 2), 6);
    }
    @Test
    public void testDivide() {
        Assert.assertEquals(calculator.divide(6, 2), 3);
    }
}
