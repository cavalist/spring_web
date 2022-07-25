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
    public Notice(int id, String title, String writerId, String content, Date regDate, int hit, String files,
            boolean pub) {
        this.id = id;
        this.title = title;
        this.writerId = writerId;
        this.content = content;
        this.regDate = regDate;
        this.hit = hit;
        this.files = files;
        this.pub = pub;
    }
    
    public Notice(String title, String writerId, Date regDate, int hit, String files) {
        this.title = title;
        this.writerId = writerId;
        this.regDate = regDate;
        this.hit = hit;
        this.files = files;
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
    public String getTitle() {
        return title;
    }
    public String getWriterId() {
        return writerId;
    }
    public String getContent() {
        return content;
    }
    public Date getRegDate() {
        return regDate;
    }
    public int getHit() {
        return hit;
    }
    public String getFiles() {
        return files;
    }
    public boolean isPub() {
        return pub;
    }

    @Override
    public String toString() {
        return "Notice [content=" + content + ", files=" + files + ", hit=" + hit + ", id=" + id + ", pub=" + pub
                + ", regDate=" + regDate + ", title=" + title + ", writerId=" + writerId + "]";
    }

    

    
    
}
