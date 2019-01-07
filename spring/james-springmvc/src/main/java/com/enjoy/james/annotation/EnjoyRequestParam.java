package com.enjoy.james.annotation;

import java.lang.annotation.*;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EnjoyRequestParam {
    String value() default "";
}
