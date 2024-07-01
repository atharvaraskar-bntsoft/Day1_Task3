package com.bnt.CalculatorWithExecutor.Service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.verify;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class CalculatorServiceTest {

    @InjectMocks
    private CalculatorService calculatorService;
     
    @Mock
    Logger logger = LoggerFactory.getLogger(CalculatorService.class);

    @Test
    public void testCalculateSquare() {
        calculatorService.calculateSquare(5);
        verify(logger).info("Square of {} is {}", 5, 25);
    }

    @Test
    public void testCalculateCube() {
        calculatorService.calculateCube(5);
        verify(logger).info("Cube of {} is {}", 5, 125);
    }

    @Test
    public void testCalculateEvenOdd() {
        calculatorService.calculateEvenOdd(6);
        verify(logger).info("{} is even", 6);
    }

    @Test
    public void testCalculatePrimeOrNot_Prime() {
        calculatorService.calculatePrimeOrNot(7);
        verify(logger).info("{} is prime number", 7);
    }



    @Test
    public void testCalculateFactorial() {
        calculatorService.calculateFactorial(4);
        verify(logger).info("Factorial of {} is: {}", 4, 24);
    }

    @Test
    public void testCalculateReverse() {
        calculatorService.calculateReverse(123);
        verify(logger).info("Reverse of {} is: {}", 123, 321);
    }

    @Test
    public void testCalculatePalindromeOrNot_Palindrome() {
        calculatorService.calculatePalindromeOrNot(121);
        verify(logger).info("{} is a palindrome number", 121);
    }



    @Test
    public void testCalculateArmstrongOrNot_Armstrong() {
        calculatorService.calculateArmstrongOrNot(153);
        verify(logger).info("{} is an Armstrong number", 153);
    }


    


}
