package org.perscholas.casestudy.controller;

import lombok.extern.slf4j.Slf4j;
import org.perscholas.casestudy.database.dao.OrderDetailDAO;
import org.perscholas.casestudy.database.dao.ProductDAO;
import org.perscholas.casestudy.database.entity.User;
import org.perscholas.casestudy.security.AuthenticatedUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
public class CartController {
    @Autowired
    ProductDAO productDAO;

    @Autowired
    OrderDetailDAO orderDetailDAO;

    @Autowired
    AuthenticatedUserService authenticatedUserService;

    @GetMapping("/cart/addItem")
    public String addToCart(@RequestParam Integer productId) {
        log.debug("In add to cart controller method with productId = " + productId + " and userId = " + authenticatedUserService.loadCurrentUser().getId());

        User user = authenticatedUserService.loadCurrentUser();

        return "redirect:/";
    }
}
