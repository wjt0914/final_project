package com.baizhi.dao;

import com.baizhi.entity.Banner;

import java.util.List;

/**
 * Created by Administrator on 2018/8/29 0029.
 */
public interface BannerDAO {
    /**
     * 1.查询所有轮播图片
     * @return
     */
    List<Banner> queryAll();

    /**
     * 2.删除轮播图片
     * @param id
     */
    void delete(Integer id);
}
