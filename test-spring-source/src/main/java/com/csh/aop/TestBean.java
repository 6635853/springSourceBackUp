package com.csh.aop;

import org.springframework.stereotype.Component;

/**
 * @author csh
 * @version 1.0
 * @date 2020/7/3
 * @package com.csh.aop
 */
public class TestBean {

	private String testStr = "testString";

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}

	public String getTestStr() {
		return testStr;
	}

	public void test() {
		System.out.println(" test ");
	}
}
