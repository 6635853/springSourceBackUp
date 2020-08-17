package com.csh.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author csh
 * @version 1.0
 * @date 2020/7/3
 * @package com.csh.aop
 */
@Aspect
public class AspectJTest {

	// 定义切入点
	@Pointcut(value = "execution(* *.test(..))")
	public void test() {

	}

	@Before(value = "test()")
	public void beforeTest() {
		System.out.println(" ====== beofre =======");
	}

	@After(value = "test()")
	public void afterTest() {
		System.out.println(" ====== after ======= ");
	}

	@Around(value = "test()")
	public Object arountTest(ProceedingJoinPoint point) {
		System.out.println(" ====== around ====== ");
		System.out.println(point.getSignature());
		Object proceed = null;
		try {
			proceed = point.proceed();
		} catch (Throwable t) {
			t.printStackTrace();
		}
		System.out.println(proceed);
		return proceed;
	}
}
