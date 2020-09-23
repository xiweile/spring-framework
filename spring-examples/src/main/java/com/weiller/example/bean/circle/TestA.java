package com.weiller.example.bean.circle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestA {

	@Autowired
	private  TestB testB;

	public TestA(){}

	public TestA(TestB testB) {
		this.testB = testB;
	}

	public void a(){
		testB.b();
	}

	public TestB getTestB() {
		return testB;
	}

	public void setTestB(TestB testB) {
		this.testB = testB;
	}
}

