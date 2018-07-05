/*
 * Copyright 2018 SF Airlines Co., Ltd. All rights reserved.
 * 本文件仅限于顺丰航空有限公司内部传阅，禁止外泄以及用于其他的商业目的。
 */
package com.sfa.test.biz.impl;

import org.springframework.stereotype.Service;

import com.sfa.test.biz.IUserBiz;
import com.sfa.test.dao.IUserDao;
import com.sfa.test.domain.User;

/**
 * @author 01367627
 *
 */
@Service
public class UserBizImpl implements IUserBiz {

    private IUserDao userDao;
    
    /**
     * @param userDao the userDao to set
     */
    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public void save(User user) {
        userDao.save(user);
    }

}
