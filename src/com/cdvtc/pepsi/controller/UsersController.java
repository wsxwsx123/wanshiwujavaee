package com.cdvtc.pepsi.controller;

import com.cdvtc.pepsi.dao.Dao;
import com.cdvtc.pepsi.dao.HibernateDaoImpl;
import com.cdvtc.pepsi.data.TbUser;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

public class UsersController {
    Dao dao=new HibernateDaoImpl();

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

    /**
     * 注册
     * @param user
     * @param model
     * @return
     */
    @RequestMapping("/register")
    public String register(@ModelAttribute TbUser user, Model model){
        String name=user.getUserName();
        boolean error=false;
        if(name==null || name.length()==0){
            model.addAttribute("error_name","用户名不能为空！");
            error=true;
        }
        if(error){
            return "register";
        }else{
            dao.addUser(user);
            return "redirect:/listContacts";
        }
    }
    @RequestMapping("/toEdit/{userName}")
    public String toEditPage(@PathVariable("userName")String userName, Model model){
        TbUser user=dao.getUser(userName);
        model.addAttribute("user",user);
        return "edit";
    }
    @RequestMapping("/tochangePass/{userName}")
    public String tochangePass(@PathVariable("userName")String userName, Model model){
        TbUser user=dao.getUser(userName);
        model.addAttribute("user",user);
        return "changePass";
    }
    @RequestMapping("/changePass")
    public String changePass(@ModelAttribute TbUser user,Model model){
        return null;
    }
    @RequestMapping("/update")
    public String updateUser(@ModelAttribute TbUser user,Model model){
        String name=user.getUserName();
        boolean error=false;
        if(name==null || name.length()==0){
            error=true;
            model.addAttribute("error_name","姓名不能为空！");
        }
        if(error){
            return "edit";
        }else{
            dao.updateUser(user);
            return "redirect:/listContacts";
        }

    }

}
