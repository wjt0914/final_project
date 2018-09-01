package com.baizhi.dao;

import com.baizhi.entity.Album;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2018/8/30 0030.
 */
public interface AlbumDAO {
    List<Album> showAll(@Param("begin") int begin,
                        @Param("rows") int rows);
    int count();
}
