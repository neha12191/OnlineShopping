package org.uel.onlineshopping.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.uel.onlineshopping.service.CartService;
import org.uel.onlineshopping.service.OrderService;

@Controller
@RequestMapping("/orders")
public class OrderController {

	private final static Logger logger = LoggerFactory.getLogger(OrderController.class);
	
	@Autowired
	private OrderService orderService;
	@RequestMapping("/orders")
	public ModelAndView showOrder(@RequestParam(name="success",required=false)String success) {
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Order");
		mv.addObject("userClickShowOrder", true);
		
		if(success!=null) {
			mv.addObject("orderDetail",orderService.getOrders());
			//orderService.getOrders();
		}
		return mv;
					}
		
}