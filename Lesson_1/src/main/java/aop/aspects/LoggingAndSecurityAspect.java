package aop.aspects;
//изменение от 20.11.2023пше
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect

public class LoggingAndSecurityAspect {

//    @Pointcut("execution(* get*())")
//    private void allGetMethods() {}
////    @Before("execution(public void aop.UniLibrary.getBook())")
////@Before("execution(* get*())")
//@Before("allGetMethods()")
//
////это означает, что в подшаблон этого pointcat будут подъходить все методы public void , начинающиеся на get и у которых неит парамтеров
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetBookAdvice: попытка получить книгу или журнал");
//    }
//
////    @Before("execution(* get*())")
//@Before("allGetMethods()")
//    public void beforeGetSecurityAdvice(){
//        System.out.println("beforeGetSecurityAdvice: проверка прав на +" +
//                "полукчение книга/журпнала");
//    }









//
////@Before("execution(public * returnBook())")
//@Before("execution( * returnBook())")
////это означает, что в подшаблон этого pointcat будут подъходить все методы public void , начинающиеся на get и у которых неит парамтеров
//public void beforeReturnBookAdvice() {
//    System.out.println("beforeReturnBookAdvice: попытка вернгуть книгу");
//}

}
