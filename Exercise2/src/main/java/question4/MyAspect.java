package question4;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

    @Before("execution(* *(..))")
    public void display() {
        System.out.println("<-------------MyAspectClass-------------->");
    }
}
