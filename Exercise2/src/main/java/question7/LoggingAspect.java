package question7;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

    @Before("execution(public void question7.Student.details())")
    public void print() {
        System.out.println("<---------------------------------------------------->");
    }

    @Before("within(question7.*)")
    public void print1(){
        System.out.println("<******************************************************>");
    }

    @After("bean(student)")
    public void print2(){
        System.out.println("<__________________________________________________________>");
    }

    @After("args(String)")
    public void print3(){
        System.out.println("<^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^>");
    }

    @After("this(question7.Student)")
    public void print4(){
        System.out.println("<###############################################################>");
    }
}
