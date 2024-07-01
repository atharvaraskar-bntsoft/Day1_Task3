package com.bnt.CalculatorWithExecutor.Service;

import com.bnt.CalculatorWithExecutor.Exception.InputValidationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
public class CalculatorService {
      Logger logger = LoggerFactory.getLogger(CalculatorService.class);
     ExecutorService executor = Executors.newFixedThreadPool(8);

    public void calculate(int n) {
        executor.submit(() -> calculateSquare(n));
        executor.submit(() -> calculateCube(n));
        executor.submit(() -> calculateEvenOdd(n));
        executor.submit(() -> calculatePrimeOrNot(n));
        executor.submit(() -> calculateFactorial(n));
        executor.submit(() -> calculateReverse(n));
        executor.submit(() -> calculatePalindromeOrNot(n));
        executor.submit(() -> calculateArmstrongOrNot(n));
    }

     public void calculateSquare(int n) {
        if (n < 0) {
            throw new InputValidationException("Number must be non-negative for square calculation.");
        }
        int square = n * n;
        logger.info("Square of {} is {}", n, square);
    }

    void calculateCube(int n) {
        if (n < 0) {
            throw new InputValidationException("Number must be non-negative for cube calculation.");
        }
        int cube = n * n * n;
        logger.info("Cube of {} is {}", n, cube);
    }

     void calculateEvenOdd(int n) {
        if (n % 2 == 0) {
            logger.info("{} is even", n);
        } else {
            logger.info("{} is odd", n);
        }
    }

     void calculatePrimeOrNot(int n) {
        int flag = 0;
        if (n == 0 || n == 1) {
            logger.info("{} is not prime number", n);
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    logger.info("{} is not prime number", n);
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                logger.info("{} is prime number", n);
            }
        }
    }

     void calculateFactorial(int n) {
        if (n < 0) {
            throw new InputValidationException("Number must be non-negative for factorial calculation.");
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        logger.info("Factorial of {} is: {}", n, fact);
    }

     void calculateReverse(int n) {
        int number = n;
        int reverse = 0;
        while (number > 0) {
            int rem = number % 10;
            reverse = (reverse * 10) + rem;
            number = number / 10;
        }
        logger.info("Reverse of {} is: {}", n, reverse);
    }

     void calculatePalindromeOrNot(int n) {
        int number = n;
        int reverse = 0;
        while (number > 0) {
            int rem = number % 10;
            reverse = (reverse * 10) + rem;
            number = number / 10;
        }
        if (reverse == n) {
            logger.info("{} is a palindrome number", n);
        } else {
            logger.info("{} is not a palindrome number", n);
        }
    }

     void calculateArmstrongOrNot(int n) {
        if (n < 0) {
            throw new InputValidationException("Number must be non-negative for Armstrong number check.");
        }
        int temp = n;
        int count = 0;
        int sum = 0;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }

        temp = n;
        while (temp > 0) {
            int last = temp % 10;
            sum += (Math.pow(last, count));
            temp = temp / 10;
        }

        if (n == sum) {
            logger.info("{} is an Armstrong number", n);
        } else {
            logger.info("{} is not an Armstrong number", n);
        }
    }
}
