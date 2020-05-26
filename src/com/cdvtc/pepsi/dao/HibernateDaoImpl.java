package com.cdvtc.pepsi.dao;

import com.cdvtc.pepsi.data.TbUser;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

public class HibernateDaoImpl implements Dao {
    private static final SessionFactory ourSessionFactory;
    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            ourSessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }



    @Override
    public void addUser(TbUser user) {
        final Session session = getSession();
        Transaction transaction=session.beginTransaction();
        session.save(user);
        transaction.commit();
        session.close();
    }




    @Override
    public boolean isNameExisted(String userName) {
        final Session session = getSession();
        try {


            Query query=session.createQuery("from TbUser c where c.userName=:userName");
            query.setParameter("userName",userName);
           TbUser user= (TbUser) query.uniqueResult();
            if(user!=null){
                return true;
            }
        } finally {
            session.close();
        }
        return false;
    }


    @Override
    public TbUser getOldPass(String userOldPass,String userName) {
        final Session session = getSession();
        TbUser user=new TbUser();
        try {
            Query query=session.createQuery(" from TbUser userName where  userName.password=?1 ");
            query.setParameter(1,userOldPass);
            user=(TbUser) query.uniqueResult();
        }   finally {
            session.close();
        }


        return  user;
    }
    @Override
    public TbUser getUser(String userName) {
        final Session session = getSession();
       TbUser user=session.get(TbUser.class,userName);
        session.close();
        return user;
    }



    @Override
    public void updateUser(TbUser user) {
        final Session session = getSession();
        Transaction transaction=session.beginTransaction();
        session.update(user);
        transaction.commit();
        session.close();
    }




}
