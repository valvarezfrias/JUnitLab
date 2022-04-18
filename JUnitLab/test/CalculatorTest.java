import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.add(2,2));
    }

    @Test
    public void testAddZero(){
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.add(0,0));
    }

    @Test
    public void testAddNegative(){
        Calculator calculator = new Calculator();
        assertEquals(-2, calculator.add(-1,-1));
    }

    @Test
    public void testSubtract(){
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.subtract(1,1));
    }

    @Test
    public void testSubtractZero(){
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.subtract(0, 0));
    }

    @Test
    public void testSubtractNegative(){
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.subtract(-10,-10));
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(6,calculator.multiply(2,3));
    }

    @Test
    public void testMultiplyZero() {
        Calculator calculator = new Calculator();
        assertEquals(0,calculator.multiply(2,0));
    }

    @Test
    public void testMultiplyNegative() {
        Calculator calculator = new Calculator();
        assertEquals(-8,calculator.multiply(2,-4));
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(4,calculator.divide(16,4),0);
    }

    @Test
    public void testDivideNegative() {
        Calculator calculator = new Calculator();
        assertEquals(-4,calculator.divide(16,-4),0);
    }

    @Test
    public void testDivideZero() {
        Calculator calculator = new Calculator();
        try {
            float divZero = calculator.divide(16, 0);
        }catch(ArithmeticException e){
            //test succeeded
        }

    }

    @Test
    public void testAndF() {
        Calculator calculator = new Calculator();
        assertFalse(calculator.and(true,false));
    }

    @Test
    public void testAndFF() {
        Calculator calculator = new Calculator();
        assertFalse(calculator.and(false,false));
    }

    @Test
    public void testAndT() {
        Calculator calculator = new Calculator();
        assertTrue(calculator.and(true,true));
    }

    @Test
    public void testEvaluate() {
        Calculator calculator = new Calculator();
        int sum = calculator.evaluate("1+2+3");
        assertEquals(6, sum);
    }



}