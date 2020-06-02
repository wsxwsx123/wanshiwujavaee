package com.cdvtc.pepsi.controller;


import com.cdvtc.pepsi.dao.Dao;
import com.cdvtc.pepsi.dao.HibernateDaoImpl;
import com.cdvtc.pepsi.data.TbUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ContactController {


    /**
     * 跳转到注册页面
     * @param model
     * @return
     */

    /**
     * 跳转到登录页面
     * @return
     */
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }


}
