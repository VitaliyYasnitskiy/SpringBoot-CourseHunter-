package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void afterReturningGetStudentsLoggingAdvice(){
        System.out.println("afterReturningGetStudentsLoggingAdvice: логируем получение " +
                "списка студентов после мработы метода getStudents ");
    }
 //   @AfterReturning(pointcut =  "execution(* getStudents())"
  //  , returning = "students")
//    public void beforeGetStudentsLoggingAdvice(List<Student> students) {
//        Student firstStudent = students.get(0);
//
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr"+nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//        // тут мы изменили результта в методе код
//
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade = avgGrade+1;
//        firstStudent.setAvgGrade(avgGrade);
//
//
//        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение " +
//                "списка студентов перед методом getStudents ");
//    }
@AfterThrowing(pointcut = "execution (* getStudents())"
,throwing = "exception")
    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception){
        System.out.println("afterThrowingGetStudentsLoggingAdvice: в этом эдвайсе мы логируем выброс "+
                "исключения "+exception);
    }

}