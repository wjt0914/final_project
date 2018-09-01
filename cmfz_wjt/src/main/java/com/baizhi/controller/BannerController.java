package com.baizhi.controller;

import com.baizhi.entity.Banner;
import com.baizhi.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2018/8/29 0029.
 */
@Controller
@RequestMapping("/banner")
public class BannerController {
    @Autowired
    private BannerService bannerService;
    @RequestMapping("/queryAll")
    @ResponseBody
    public List<Banner> queryAll(){
        List<Banner> list = bannerService.queryAll();
        return list;
    }
    @RequestMapping("/delete")
    public void delete(Integer id){
        bannerService.delete(id);
    }
}
