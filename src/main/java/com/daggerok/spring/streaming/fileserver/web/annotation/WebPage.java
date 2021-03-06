package com.daggerok.spring.streaming.fileserver.web.annotation;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target({TYPE})
@Documented
@Controller
@RequestMapping
public @interface WebPage {

    @AliasFor(annotation = RequestMapping.class, attribute = "path") String[] value() default {};

    @AliasFor(annotation = RequestMapping.class, attribute = "value") String[] path() default {};

    @AliasFor(annotation = RequestMapping.class, attribute = "produces") String[] produces() default {};
}
