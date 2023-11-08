package org.example;
import org.example.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;
public class PriorityTest {
    Calculator calculator = new Calculator();
    @Test(priority = 1)
    public void testAdd() {
        Assert.assertEquals(calculator.add(3, 2), 5);
    }
    @Test(priority = 2, dependsOnMethods = {"testAdd"})
    public void testMultiply() {
        Assert.assertEquals(calculator.multiply(3, 2), 6);
    }
}
