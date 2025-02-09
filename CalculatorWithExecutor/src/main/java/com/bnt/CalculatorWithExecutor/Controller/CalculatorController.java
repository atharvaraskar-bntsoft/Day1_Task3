package com.bnt.CalculatorWithExecutor.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bnt.CalculatorWithExecutor.Service.CalculatorService;

@RestController
@RequestMapping("/calculatorapi/calculations")
public class CalculatorController {

    @Autowired
    CalculatorService  calculatorService;

    @GetMapping("/{number}")
    void getResult(@PathVariable int number){
          calculatorService.calculate(number);     
    }

}
