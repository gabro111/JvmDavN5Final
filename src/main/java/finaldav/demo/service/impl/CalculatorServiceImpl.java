package finaldav.demo.service.impl;

import finaldav.demo.aspect.Println;
import finaldav.demo.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Println
    @Override
    public int multiplication(int x, int y) {
        return x+y;
    }
}
