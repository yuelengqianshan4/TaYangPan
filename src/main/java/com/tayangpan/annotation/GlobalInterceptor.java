package com.tayangpan.annotation;

import org.springframework.web.bind.annotation.Mapping;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Mapping
public @interface GlobalInterceptor {

    /**
     * 校验登录
     *
     * @return boolean
     */
    boolean checkLogin() default true;

    /**
     * 校验参数
     *
     * @return boolean
     */
    boolean checkParams() default false;

    /**
     * 校验管理员
     *
     * @return boolean
     */
    boolean checkAdmin() default false;
}
