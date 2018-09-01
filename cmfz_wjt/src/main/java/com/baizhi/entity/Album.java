package com.baizhi.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/8/30 0030.
 */
public class Album implements Serializable {
    private Integer id;
    private String title;
    private Integer count;
    private String coverage;
    private Double score;
    private String author;
    private String announcer;
    private String brief;
    private Date publishDate;
    private Date createDate;
    private String status;
    private List<Chapter> children;

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", count=" + count +
                ", coverage='" + coverage + '\'' +
                ", score=" + score +
                ", author='" + author + '\'' +
                ", announcer='" + announcer + '\'' +
                ", brief='" + brief + '\'' +
                ", publishDate=" + publishDate +
                ", createDate=" + createDate +
                ", status='" + status + '\'' +
                ", children=" + children +
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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getCoverage() {
        return coverage;
    }

    public void setCoverage(String coverage) {
        this.coverage = coverage;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAnnouncer() {
        return announcer;
    }

    public void setAnnouncer(String announcer) {
        this.announcer = announcer;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Chapter> getChildren() {
        return children;
    }

    public void setChildren(List<Chapter> children) {
        this.children = children;
    }

    public Album(Integer id, String title, Integer count, String coverage, Double score, String author, String announcer, String brief, Date publishDate, Date createDate, String status, List<Chapter> children) {

        this.id = id;
        this.title = title;
        this.count = count;
        this.coverage = coverage;
        this.score = score;
        this.author = author;
        this.announcer = announcer;
        this.brief = brief;
        this.publishDate = publishDate;
        this.createDate = createDate;
        this.status = status;
        this.children = children;
    }

    public Album() {

    }
}
