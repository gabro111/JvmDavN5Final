package finaldav.demo.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Aspect
@Component
public class PrintAnnotationAspect {

    @Before("@annotation(finaldav.demo.aspect.Println)")
    public void getTaskAdvice(JoinPoint joinPoint){
        Object[] x = joinPoint.getArgs();

        System.out.println("გადმოცემული არგუმენტები "+ Arrays.toString(x));
    }
}
