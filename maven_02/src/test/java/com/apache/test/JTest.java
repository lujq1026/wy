package com.apache.test;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.apache.HelloWorld.HelloWorld;

public class JTest {
	@Test
	public void test1(){
		Logger log = Logger.getLogger(JTest.class);
		log.debug(new HelloWorld().prinit());
	}
}
