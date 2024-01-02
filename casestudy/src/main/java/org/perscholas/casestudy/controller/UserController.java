package org.perscholas.casestudy.controller;

import lombok.extern.slf4j.Slf4j;
import org.perscholas.casestudy.database.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
public class UserController {
    @Autowired
    private UserDAO userDao;

    @GetMapping("/user/account")
    public ModelAndView viewAccount() {
        ModelAndView response = new ModelAndView("user/account");

        log.debug("In view account");



        return response;
    }
}
