package finaldav.demo;

import finaldav.demo.service.CalculatorService;
import finaldav.demo.service.impl.CalculatorServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    CalculatorServiceImpl calculatorServiceImpl;

    @Test
    void multiplyTest(){
        int x =5;
        int y = 5;
        int result = 25;
        int task = calculatorServiceImpl.multiplication(x,y);

        assertEquals(task,result);


    }

}
