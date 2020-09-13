package com.zhy.aspect.annotation;

import java.lang.annotation.*;

/**
 * @author: zhangocean
 * @Date: 2019/11/1 13:25
 * Describe: 只是一个标记？？
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface PermissionCheck {
    String value();
}
