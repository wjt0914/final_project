package com.baizhi.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2018/8/29 0029.
 */
public class Banner implements Serializable {
    private Integer id;
    private String title;
    private String content;
    private String href;
    private String icon;
    private Integer parentId;
    private List<Banner> banners;

    public Banner() {
    }

    @Override
    public String toString() {
        return "Banner{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", href='" + href + '\'' +
                ", icon='" + icon + '\'' +
                ", parentId=" + parentId +
                ", banners=" + banners +
                '}';
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public List<Banner> getBanners() {
        return banners;
    }

    public void setBanners(List<Banner> banners) {
        this.banners = banners;
    }

    public Banner(Integer id, String title, String content, String href, String icon, Integer parentId, List<Banner> banners) {

        this.id = id;
        this.title = title;
        this.content = content;
        this.href = href;
        this.icon = icon;
        this.parentId = parentId;
        this.banners = banners;
    }
}
