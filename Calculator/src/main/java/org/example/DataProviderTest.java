package org.example;
import org.example.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
public class DataProviderTest {
    Calculator calculator=new Calculator();
    @DataProvider(name = "dataForAddition")
    public Object[][] dataForAdd() {
        return new Object[][] {
                { 1, 2, 3 },
                { 2, 3, 5},
                { 3, 3, 6 }
        };
    }
    @Test(dataProvider = "dataForAddition")
    public void testAdd(int a, int b, int expectedResult) {
        Assert.assertEquals(calculator.add(a, b), expectedResult);
    }

}
