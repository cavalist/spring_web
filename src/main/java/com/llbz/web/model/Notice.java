package com.llbz.web.model;

import java.util.Date;

public class Notice {
    //id, title, writerId, regDate, hit
    private int id;
    private String title;
    private String writerId;
    private Date regDate;
    private int hit;
    
    public Notice() {
    }

    public Notice(int id, String title, String writerId, Date regDate, int hit) {
        this.id = id;
        this.title = title;
        this.writerId = writerId;
        this.regDate = regDate;
        this.hit = hit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriterId() {
        return writerId;
    }

    public void setWriterId(String writerId) {
        this.writerId = writerId;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }
    
    
}
