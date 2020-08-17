package com.csh;

import com.csh.aop.TestBean;
import com.csh.event.TestEvent;
import com.csh.service.ILogin;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author csh
 * @version 1.0
 * @date 2020/5/28
 * @descript 测试
 * @package com.csh
 */
@ComponentScan(value = "com.csh")
public class App {
	public static void main(String[] args) {
		// 注解方式启动
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
//		ILogin loginService = (ILogin) context.getBean("loginService");
//		loginService.loginCheck("csh", "123456");
//		System.out.println("Hello World!");
//		List<String> listsByName = loginService.getListsByName(" admin ");
//		listsByName.stream().filter(item -> !item.equals("first")).collect(Collectors.toList()).forEach(i -> System.out.println(i));
//		System.out.println(" ============================================== ");
//		ILogin qqLoginService = (ILogin) context.getBean("qqLoginService");
//		qqLoginService.loginCheck("admin", "123456");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		TestEvent testEvent = new TestEvent("hello", "msg");
//		context1.publishEvent(testEvent);
		TestBean test = (TestBean) context.getBean("test");
		test.test();
	}
}