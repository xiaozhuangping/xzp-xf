package xzp.xf.pro.impl.hessian;

import java.lang.annotation.*;


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface HessianService {
	public String value() default ""; 
}
