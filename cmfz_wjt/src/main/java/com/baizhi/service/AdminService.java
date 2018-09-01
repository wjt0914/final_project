package com.baizhi.service;

import com.baizhi.entity.Admin;

/**
 * Created by Administrator on 2018/8/28 0028.
 */
public interface AdminService {
    Admin login(String name,String password);
}
