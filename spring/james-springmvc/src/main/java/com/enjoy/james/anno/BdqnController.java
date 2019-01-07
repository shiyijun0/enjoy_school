package com.enjoy.james.anno;

import java.lang.annotation.*;

@Target(ElementType.ANNOTATION_TYPE) //作用接口或者类上
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface BdqnController {
}
