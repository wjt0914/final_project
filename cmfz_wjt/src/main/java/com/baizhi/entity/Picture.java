package com.baizhi.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/8/29 0029.
 */
public class Picture implements Serializable {
    private Integer id;
    private String title;
    private String description;
    private String imgPath;
    private String uploadDate;
    private String status;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", imgPath='" + imgPath + '\'' +
                ", uploadDate='" + uploadDate + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public Picture(Integer id, String title, String description, String imgPath, String uploadDate, String status) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.imgPath = imgPath;
        this.uploadDate = uploadDate;
        this.status = status;
    }

    public Picture() {

    }
}
