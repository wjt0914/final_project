package com.baizhi.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/8/30 0030.
 */
public class Chapter implements Serializable {
    private Integer id;
    private String title;
    private String duration;
    private String size;
    private String path;
    private Integer _albumId;

    public Chapter() {
    }

    public Chapter(Integer id, String title, String duration, String size, String path, Integer _albumId) {
        this.id = id;
        this.title = title;
        this.duration = duration;
        this.size = size;
        this.path = path;
        this._albumId = _albumId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer get_albumId() {
        return _albumId;
    }

    public void set_albumId(Integer _albumId) {
        this._albumId = _albumId;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", duration='" + duration + '\'' +
                ", size='" + size + '\'' +
                ", path='" + path + '\'' +
                ", _albumId=" + _albumId +
                '}';
    }
}
