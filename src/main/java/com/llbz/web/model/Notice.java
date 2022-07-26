package com.llbz.web.model;

import java.util.Date;

public class Notice {
    private int id;
    private String title;
    private String writerId;
    private String content;
    private Date regDate;
    private int hit;
    private String files;
    private boolean pub;

    

    @Override
    public String toString() {
        return "Notice [content=" + content + ", files=" + files + ", hit=" + hit + ", id=" + id + ", pub=" + pub
                + ", regDate=" + regDate + ", title=" + title + ", writerId=" + writerId + "]";
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



    public String getContent() {
        return content;
    }



    public void setContent(String content) {
        this.content = content;
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



    public String getFiles() {
        return files;
    }



    public void setFiles(String files) {
        this.files = files;
    }



    public boolean isPub() {
        return pub;
    }



    public void setPub(boolean pub) {
        this.pub = pub;
    }
    
}
