package se.ec.oscarjohanneson;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {
    @Test
    public void test_addition_expected_result(){
        //Arrange
        double number1 = 0.5;
        double number2 = 2.5;
        double number3 = 120;
        double number4 = 4;
        double number5 = 3;
        double expectedResult = 130;
        //Act
        double result = Calculator.addition(number1, number2, number3, number4, number5);
        //Assert
        Assert.assertEquals(expectedResult, result, 0);

    }
    @Test
    public void test_subtract_expected_result(){
        double number1 = 5;
        double number2 = 3;
        double expectedResult = 2;

        double result = Calculator.subtract(number1, number2);

        Assert.assertEquals(expectedResult, result, 0);
    }
    @Test
    public void test_multiply_expected_result(){
        double number1 = 2;
        double number2 = 5;
        double expectedResult = 10;

        double result = Calculator.multiply(number1, number2);

        Assert.assertEquals(expectedResult, result, 0);
    }
    @Test
    public void test_divided_expected_result(){
        double number1 = 5;
        double number2 = 2;
        double expectedResult = 2.5;

        double result = Calculator.divided(number1, number2);

        Assert.assertEquals(expectedResult, result, 0);
    }
}
