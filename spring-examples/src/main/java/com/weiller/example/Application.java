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
		testAnnotationStart();	// 测试注解加载
		//testCircleRefrence();//测试xml配置的循环依赖
	}

	public static void testAnnotationStart(){
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Application.class);
	}

	public static void testGetBean(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springbeans.xml");
		User user = (User) applicationContext.getBean("user");
		System.out.println(user);
		user.setName("zhangsan");
		user.setAge("20");
		System.out.println(user);
	}

	/**
	 * 测试循环依赖
	 */
	public static void testCircleRefrence(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("circlebeans.xml");

	}

}
