package question9;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyNewAspect {

    @Before("execution(public String question9.Circle.getName())")
    public void print(JoinPoint joinPoint){
        System.out.println("Running before advice...");
        System.out.println(joinPoint);
        System.out.println(joinPoint.getThis());
        System.out.println(joinPoint.getKind());
        System.out.println(joinPoint.getSignature());
        System.out.println(joinPoint.getSourceLocation());
        Object[] objects = joinPoint.getArgs();
        for(Object o : objects){
            System.out.println(o);
        }
    }
}
