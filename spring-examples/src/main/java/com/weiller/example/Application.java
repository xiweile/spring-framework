package com.weiller.example;

import com.weiller.example.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan
public class Application {

	public static void main(String[] args) {
		System.out.println("启动...");
		//ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Application.class);
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springbeans.xml");
		User user = (User) applicationContext.getBean("user");
		System.out.println(user);
		user.setName("zhangsan");
		user.setAge("20");
		System.out.println(user);
	}
}
