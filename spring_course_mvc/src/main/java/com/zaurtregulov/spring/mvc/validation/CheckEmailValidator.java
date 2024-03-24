package com.zaurtregulov.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckEmailValidator
        implements ConstraintValidator<CheckEmail, String> {
    private String endOfEmail;  // переменная, которая будет содеоржать хвост нашего емейла

    @Override
    public void initialize(CheckEmail checkEmail) {
        endOfEmail = checkEmail.value();

        //ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String enteredValue
            , ConstraintValidatorContext constraintValidatorContext) {
        return enteredValue.endsWith(endOfEmail);

    }
}
