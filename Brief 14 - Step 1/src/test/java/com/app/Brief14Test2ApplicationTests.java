package com.app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.entity.*;
import com.app.sevice.impli.ServiceCategoryImpli;
import com.app.sevice.impli.ServiceClientImpli;

@SpringBootTest
class Brief14Test2ApplicationTests {
	
	@Autowired
	ServiceClientImpli serviceClientImpli;

	@Test
	void contextLoads() {
		
	}
	
	@Test
	public void Test1 () {
		
		System.out.println(serviceClientImpli.getAll());
		
	}

}
