package com.nous.project.template.controller;

import com.nous.project.template.domain.ShoppingCart;
import com.nous.project.template.exception.BaseException;
import com.nous.project.template.exception.GlobalExceptionHandler;
import com.nous.project.template.service.ShoppingCartService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by sahan on 4/14/2016.
 */
@RestController
@RequestMapping("/history")
public class HistoryController {

    @Autowired
    private ShoppingCartService shoppingCartService;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<ShoppingCart> getAll(){
    	List<ShoppingCart> purchasedList=shoppingCartService.findByPurchased();
    	if(purchasedList.isEmpty()) {
    		 throw new GlobalExceptionHandler().productNotPurchased("There are no purchased items in your cart");
    	}
    		return purchasedList;
    }


}
