package com.iknowers.springboot.learning;

import com.iknowers.springboot.learning.aop.MockService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

	@Autowired
	private MockService service;

	@Test
	public void testAnnotationAop() throws InterruptedException {
		service.doThings();
		service.doOtherThings();
	}

}
