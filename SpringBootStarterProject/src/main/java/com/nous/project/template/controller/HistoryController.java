package com.nous.project.template.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nous.project.template.domain.ShoppingCart;
import com.nous.project.template.exception.ApiErrorResponse;
import com.nous.project.template.exception.GlobalExceptionHandler;
import com.nous.project.template.service.ShoppingCartService;

@RestController
@RequestMapping("/history")
public class HistoryController {

	@Autowired
	private ShoppingCartService shoppingCartService;

	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public List<ShoppingCart> getAll() throws ApiErrorResponse {
		List<ShoppingCart> purchasedList = shoppingCartService.findByPurchased();
		if (purchasedList.isEmpty()) {
			throw new GlobalExceptionHandler().productNotPurchased("There are no purchased items in your cart");
		}
		return purchasedList;
	}

}
