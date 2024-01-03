package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect

public class newLoggingAspect {
@Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint)
    throws Throwable{
    System.out.println("aroundReturnBookLoggingAdvice: в библиотеку "+
            "пытаются вернуть книгу");
    long begin = System.currentTimeMillis();
    Object targetMethodResult = proceedingJoinPoint.proceed();
    long end= System.currentTimeMillis();

    System.out.println("aroundReturnBookLoggingAdvice: в библиотеку "+
            "успешно вернули книгу");
    System.out.println("aroundReturnBookLoggingAdvice: метод returnBook"+
            "выполнил рпботу за"+ (end-begin)+"милисекунд");
    return targetMethodResult;
}
}



