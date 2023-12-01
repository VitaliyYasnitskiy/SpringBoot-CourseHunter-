package aop.aspects;
//изменение от 20.11.2023пше
import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)


public class LoggingAspect {
//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void allMethodsFromUnilibrary(){
//
//    }
//    @Pointcut("execution(public void aop.UniLibrary.returnMagasine())")
//    private void returnMagazineFromUnilibrary() {
//
//    }
//
//    @Pointcut("allMethodsFromUnilibrary() && !returnMagazineFromUnilibrary()")
//    private void allMethodsExceptReturnMagazineFromUnilibrary(){
//
//    }
//
//    @Before("allMethodsExceptReturnMagazineFromUnilibrary()")
//    public void beforeAllMethodsExceptReturnMagazineAdvice(){
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: Log #10");
//    }
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

@Before("aop.aspects.MyPointCuts.allAddMethods()")

//это означает, что в подшаблон этого pointcat будут подъходить все методы public void , начинающиеся на get и у которых неит парамтеров
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {

    MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
    System.out.println("methodSignature = "+methodSignature.getMethod());
    System.out.println("methodSignature.getMethod() = "
            + methodSignature.getMethod());
    System.out.println("methodSignature.getMethod() = "
            + methodSignature.getReturnType());
    System.out.println("methodSignature.getReturnType() = "
            + methodSignature.getName());

        System.out.println("beforeGetBookAdvice: логирвоание попытки получить книгу или журнал");
        System.out.println("----------------------------");

        if (methodSignature.getName().equals("addBook")) {
        Object[] arguments = joinPoint.getArgs();
        for(Object obj:arguments){
            if (obj instanceof Book) {
                Book myBook = (Book) obj;
                System.out.println("Информация о книге: название книги - "+
                myBook.getName()+", автор - "+ myBook.getAuthor()+
                ", год издания - "+ myBook.getYearOfPublication());
            }
            else if(obj instanceof  String){
                System.out.println("книгу в библиотеку добавляет" + obj);
            }
        }
    }
}










//
////@Before("execution(public * returnBook())")
//@Before("execution( * returnBook())")
////это означает, что в подшаблон этого pointcat будут подъходить все методы public void , начинающиеся на get и у которых неит парамтеров
//public void beforeReturnBookAdvice() {
//    System.out.println("beforeReturnBookAdvice: попытка вернгуть книгу");
//}

}
