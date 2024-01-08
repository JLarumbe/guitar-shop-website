package org.perscholas.casestudy.controller;

import lombok.extern.slf4j.Slf4j;
import org.perscholas.casestudy.database.dao.OrderDAO;
import org.perscholas.casestudy.database.dao.OrderDetailDAO;
import org.perscholas.casestudy.database.dao.ProductDAO;
import org.perscholas.casestudy.database.entity.Order;
import org.perscholas.casestudy.database.entity.User;
import org.perscholas.casestudy.security.AuthenticatedUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Date;
@Slf4j
@Controller
public class CartController {
    @Autowired
    ProductDAO productDAO;

    @Autowired
    OrderDetailDAO orderDetailDAO;

    @Autowired
    OrderDAO orderDAO;

    @Autowired
    AuthenticatedUserService authenticatedUserService;

    @GetMapping("/cart/addItem")
    public String addToCart(@RequestParam Integer productId) {
        User user = authenticatedUserService.loadCurrentUser();

        log.debug("In add to cart controller method with productId = " + productId + " and email = " + user.getEmail());

        Order order = orderDAO.findByUser(user.getId());

        if(order == null) {
            log.debug("Creating new order for user " + user.getEmail());
            order = new Order();
            order.setUser(user);
            order.setOrderDate(new Date(System.currentTimeMillis()));
            order.setShippingAddress(user.getAddress() + " " + user.getCity() + ", " + user.getState() + " " + user.getZipCode());
            order.setStatus("CART");
            orderDAO.save(order);
        } else {
            log.debug("Found existing order for user " + user.getEmail());
        }

        return "redirect:/";
    }
}
