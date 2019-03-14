package question5;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {

    @Around("execution(void question5.Circle.print())")
    public void loggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        proceedingJoinPoint.proceed();
        System.out.println("<<<<<<<<<<advice running>>>>>>>>>>>");
        proceedingJoinPoint.proceed();
    }

}
