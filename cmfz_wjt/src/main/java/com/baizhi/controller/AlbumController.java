package com.baizhi.controller;

import com.baizhi.entity.Album;
import com.baizhi.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/8/30 0030.
 */
@Controller
@RequestMapping("/album")
public class AlbumController {
    @Autowired
    private AlbumService albumService;
    @RequestMapping("/showA")
    @ResponseBody
    public Map<String, Object> showAll(Integer page, Integer rows){
        HashMap<String, Object> map = new HashMap<>();
        List<Album> list = albumService.showAll(page,rows);
        int total = albumService.count();
        map.put("total",total);
        map.put("rows",list);
        return map;
    }

}
