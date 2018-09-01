package com.baizhi.service;

import com.baizhi.dao.AdminDAO;
import com.baizhi.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2018/8/28 0028.
 */
@Service
@Transactional
public class AdminServiceImpl implements AdminService{
    @Autowired
    private AdminDAO adminDAO;
    @Override
    public Admin login(String name, String password) {
        Admin admin = adminDAO.login(name,password);
        return admin;
    }
}
