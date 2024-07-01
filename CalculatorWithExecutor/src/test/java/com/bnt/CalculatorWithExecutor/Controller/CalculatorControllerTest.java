package com.bnt.CalculatorWithExecutor.Controller;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.bnt.CalculatorWithExecutor.Service.CalculatorService;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class CalculatorControllerTest {

     @Mock 
    CalculatorService calculatorService;

    @InjectMocks
    CalculatorController calculatorContoller;


    @Test
    public void testCalculateEndpoint() throws Exception {
        int number=7;
        calculatorContoller.getResult(number);
        verify(calculatorService, times(1)).calculate(number);
    }

}
