/*
 * Copyright 2018 SF Airlines Co., Ltd. All rights reserved.
 * 本文件仅限于顺丰航空有限公司内部传阅，禁止外泄以及用于其他的商业目的。
 */
package com.sfa.test.dao.impl;

import org.hibernate.SessionFactory;

import com.sfa.test.dao.IUserDao;
import com.sfa.test.domain.User;

/**
 * @author 01367627
 *
 */
public class UserDaoImpl implements IUserDao {

    private SessionFactory sessionFactory;
    
    /**
     * @param sessionFactory the sessionFactory to set
     */
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(User user) {
        this.sessionFactory.getCurrentSession().save(user);
    }

}
