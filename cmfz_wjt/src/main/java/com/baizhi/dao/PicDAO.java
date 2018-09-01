package com.baizhi.dao;

import com.baizhi.entity.Picture;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2018/8/29 0029.
 */
public interface PicDAO {
    /**
     * 1.根据起始行、每页条数查询所有图片信息
     * @param begin
     * @param rows
     * @return
     */
    List<Picture> showAll(@Param("begin") int begin, @Param("rows") int rows);

    /**
     * 2.查询总记录数
     * @return
     */
    int count();
    /**
     * 3.删除图片信息
     */
    void delete(Integer id);
    /**
     * 4.添加图片
     */
    void add(Picture picture);
}
