package com.baizhi.controller;

import com.baizhi.entity.Admin;
import com.baizhi.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2018/8/28 0028.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;
    @RequestMapping("/login")
    public String login(String name,
                        String password,
                        String enCode,
                        HttpSession session){
        String  code = (String) session.getAttribute("#code");
        if (code.equalsIgnoreCase(enCode)){
            Admin admin = adminService.login(name, password);
            if (admin!=null){
                return "main";
            }else
                return "login";
        }else {
            return "login";
        }

    }
}
