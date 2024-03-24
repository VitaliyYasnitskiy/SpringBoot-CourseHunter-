package com.zaurtregulov.spring.mvc.validation;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)  // означает, что информац ия о нашей аа=нгтоации checkEmail должна сораняться вплоть до выполнения кода (вплоть до runtime)
@Constraint(validatedBy =   CheckEmailValidator.class) //  Класс CheckEmailValidator -  будет отбрабы=тывать нашу валидацию
public @interface CheckEmail {
    public String value() default "xyz.com";  // значение, которое передается по умолчанию, если мы не указываем его в скобках
    public String message() default "email must ends with xyz.com"; // сообщерние будет выходить если валидация была неуспешнрой

    public Class<?>[] groups() default{};

    public Class <? extends Payload> [] payload() default {};  // Payload используеся для переноса метаданных клмента
}
