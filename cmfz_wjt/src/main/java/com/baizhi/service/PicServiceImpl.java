package com.baizhi.service;

import com.baizhi.dao.PicDAO;
import com.baizhi.entity.Picture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2018/8/29 0029.
 */
@Service
@Transactional
public class PicServiceImpl implements PicService {
    @Autowired
    private PicDAO picDAO;
    @Override
    public List<Picture> showAll(int currPage,int rows) {
        //每页第一条
        int begin = (currPage-1)*rows;
        List<Picture> list = picDAO.showAll(begin,rows);
        return list;
    }

    @Override
    public int count() {
        int count = picDAO.count();
        return count;
    }

    @Override
    public void delete(Integer id) {
        picDAO.delete(id);
    }

    @Override
    public void add(Picture picture) {
        picDAO.add(picture);
    }
}
