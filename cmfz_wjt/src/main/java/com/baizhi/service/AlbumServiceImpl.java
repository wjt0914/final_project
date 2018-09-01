package com.baizhi.service;

import com.baizhi.dao.AlbumDAO;
import com.baizhi.entity.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2018/8/30 0030.
 */
@Service
@Transactional
public class AlbumServiceImpl implements AlbumService {
    @Autowired
    private AlbumDAO albumDAO;
    @Override
    public List<Album> showAll(Integer currPage,Integer rows) {
        int begin = (currPage-1)*rows;
        List<Album> list = albumDAO.showAll(begin,rows);
        return list;
    }

    @Override
    public int count() {
        int count = albumDAO.count();
        return count;
    }
}
