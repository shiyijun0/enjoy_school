package com.enjoy.cap5.config;


import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class Window implements Condition {
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Environment environment=conditionContext.getEnvironment();
     String name=   environment.getProperty("os.name");
     if(name.contains("Windows"))
         return true;
        return false;
    }


}
