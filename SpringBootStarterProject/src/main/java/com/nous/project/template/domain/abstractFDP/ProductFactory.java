package com.nous.project.template.domain.abstractFDP;

public class ProductFactory {

	public static Product getProduct(ProductAbstractFactory productAbstractFactory) {
		return productAbstractFactory.createProduct();

	}

}
