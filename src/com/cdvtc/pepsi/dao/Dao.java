package com.cdvtc.pepsi.dao;

import com.cdvtc.pepsi.data.TbUser;

import java.util.List;

public interface Dao {



    /**
     *  添加用户
     * @param user
     */
    void addUser(TbUser user);



    /**
     * 判断姓名是否存在
     * @param userName
     * @return
     */
    boolean isNameExisted(String userName);



    /**
     * 根据用户名获取一条用户
     * @param userName)
     * @return
     */
    TbUser getUser(String  userName);
    /**
     * 判断旧密码是否正确
     * @param userOldPass)
     * @return
     */
    TbUser getOldPass(String  userOldPass,String userName);

    /**
     * 更新个人信息
     * @param user
     */
    void updateUser(TbUser user);


}
