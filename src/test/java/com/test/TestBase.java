package com.test;

import org.junit.After;
import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBase {
	protected ClassPathXmlApplicationContext ctx;
	
	@Before
	public void init(){
		String cfg="spring-configs.xml";
		ctx=new ClassPathXmlApplicationContext(cfg);
	}
	@After
	public void close(){
		ctx.close();
	}


}
