package com.nous.project.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nous.project.template.service.ProductService;
import com.nous.project.template.service.UserService;

@SpringBootApplication
public class ShoppingCartApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(ShoppingCartApplication.class, args);

		ProductService productService = applicationContext.getBean(ProductService.class);
		productService.saveInitialBatch();

		UserService userService = applicationContext.getBean(UserService.class);
		userService.saveInitialBatch();


	}
}
