package com.baizhi.dao;

import com.baizhi.entity.Admin;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Administrator on 2018/8/28 0028.
 */
public interface AdminDAO {
    Admin login(
            @Param("name") String name,
            @Param("password") String password);
}
