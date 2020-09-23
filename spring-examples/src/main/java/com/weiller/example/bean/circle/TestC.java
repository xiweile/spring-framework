package com.weiller.example.bean.circle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestC {

	@Autowired
	private  TestA testA;

	public TestC(){}

	public TestC(TestA testA) {
		this.testA = testA;
	}

	public  void c(){
		testA.a();
	}

	public TestA getTestA() {
		return testA;
	}

	public void setTestA(TestA testA) {
		this.testA = testA;
	}
}
