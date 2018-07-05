/*
 * Copyright 2018 SF Airlines Co., Ltd. All rights reserved.
 * ���ļ�������˳�ẽ�����޹�˾�ڲ����ģ���ֹ��й�Լ�������������ҵĿ�ġ�
 */
package com.sfa.test.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sfa.test.biz.IUserBiz;
import com.sfa.test.domain.User;

/**
 * @author 01367627
 *
 */
@Controller
@RequestMapping("/hgc")
public class TestController {
    
    @Autowired
    private IUserBiz userBiz;
    
    @RequestMapping("/test")
    public String controllerTest(ModelMap map){
        String runTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        map.addAttribute("date", runTime);
        System.out.println("当前时间："+runTime);
        return "test/test";
    }
    
    @ResponseBody
    @RequestMapping("/saveUser")
    public String saveUser(User user){
        userBiz.save(user);
        return "success";
    }
    
}