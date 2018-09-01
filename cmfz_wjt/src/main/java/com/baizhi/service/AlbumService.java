package com.baizhi.service;

import com.baizhi.entity.Album;

import java.util.List;

/**
 * Created by Administrator on 2018/8/30 0030.
 */
public interface AlbumService {
    List<Album> showAll(Integer currPage,Integer rows);
    int count();
}
