package com.nous.project.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.nous.project.template.ShoppingCartApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ShoppingCartApplication.class)
@WebAppConfiguration
public class ShoppingCartApplicationTests {

	@Test
	public void contextLoads() {
	}

}
