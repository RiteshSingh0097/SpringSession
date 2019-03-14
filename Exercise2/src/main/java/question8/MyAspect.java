package question8;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {

    @Pointcut("execution(* get*(..))")
    public void allGetter(){}

    @Before("allGetter()")
    public void beforeAdvice(){
        System.out.println("<..........................>");
    }
}
