package org.uel.onlineshopping.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.uel.onlineshopping.model.UserModel;
import org.uel.shoppingbackend.dao.OrderDAO;
import org.uel.shoppingbackend.dao.ProductDAO;
import org.uel.shoppingbackend.dto.Cart;
import org.uel.shoppingbackend.dto.OrderDetail;

@Service("orderService")
public class OrderService {

	@Autowired
	private OrderDAO orderDAO;
	
	@Autowired
	private ProductDAO productDAO;
		
	@Autowired
	private HttpSession session;
	
	public List<OrderDetail> getOrders() {

		return orderDAO.getOrder();

	}

	}
