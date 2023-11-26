package aop.aspects;
//изменение от 20.11.2023пше
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect


public class LoggingAndSecurityAspect {
    @Pointcut("execution(* aop.UniLibrary.*(..))")
    private void allMethodsFromUnilibrary(){

    }
    @Pointcut("execution(public void aop.UniLibrary.returnMagasine())")
    private void returnMagazineFromUnilibrary() {

    }

    @Pointcut("allMethodsFromUnilibrary() && !returnMagazineFromUnilibrary()")
    private void allMethodsExceptReturnMagazineFromUnilibrary(){

    }

    @Before("allMethodsExceptReturnMagazineFromUnilibrary()")
    public void beforeAllMethodsExceptReturnMagazineAdvice(){
        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: Log #10");
    }
//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void allGetsMethodsFromUnilabrary() {
//    }
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUnilabrary(){
//    }
//
//    @Pointcut("allGetsMethodsFromUnilabrary() || allReturnMethodsFromUnilabrary()")
//
//    private void allGetAndReturnMethodsFromUnilabrary(){
//
//    }
//
//    @Before("allGetsMethodsFromUnilabrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromUnilabrary()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUnilabrary()")
//        public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("beforeGetReturnLoggingAdvice: writing Log #3");
//    }
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
