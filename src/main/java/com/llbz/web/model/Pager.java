package com.llbz.web.model;

public class Pager {
    private int size;
    private int count;
    private int viewStart;
    private int viewEnd;
    
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public int getViewStart() {
        return viewStart;
    }
    public void setViewStart(int viewStart) {
        this.viewStart = viewStart;
    }
    public int getViewEnd() {
        return viewEnd;
    }
    public void setViewEnd(int viewEnd) {
        this.viewEnd = viewEnd;
    }

    
}
