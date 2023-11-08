package org.example;
import org.example.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;
public class GroupTest {
    Calculator calculator = new Calculator();
    @Test(groups = "BasicOperations")
    public void testAdd() {
        Assert.assertEquals(calculator.add(3, 2), 5);
    }
    @Test(groups = "BasicOperations")
    public void testSubtract() {
        Assert.assertEquals(calculator.subtract(3, 2), 1);
    }
    @Test(groups = "AdvancedOperations")
    public void testMultiply() {
        Assert.assertEquals(calculator.multiply(3, 2), 6);
    }
    @Test(groups = "AdvancedOperations")
    public void testDivide() {
        Assert.assertEquals(calculator.divide(6, 2), 3);
    }

}
