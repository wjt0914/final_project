package com.baizhi.service;

import com.baizhi.dao.BannerDAO;
import com.baizhi.entity.Banner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2018/8/29 0029.
 */
@Service
@Transactional
public class BannerServiceImpl implements BannerService {
    @Autowired
    private BannerDAO bannerDAO;
    @Override
    public List<Banner> queryAll() {
        List<Banner> list = bannerDAO.queryAll();
        return list;
    }

    @Override
    public void delete(Integer id) {
        bannerDAO.delete(id);
    }
}
