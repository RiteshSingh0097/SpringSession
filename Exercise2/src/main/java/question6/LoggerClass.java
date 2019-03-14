package question6;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggerClass {

    @AfterThrowing(pointcut = "execution(public void connect())", throwing = "ex")
    public void throwAdvice(Exception ex) {
        System.out.println("Running after throwing : " + ex);
    }
}
