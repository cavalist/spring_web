package com.llbz.web.dao;

import java.util.ArrayList;

import com.llbz.web.model.Notice;

public interface NoticeDaoable {
    public Notice getById(int id);
    public ArrayList<Notice> getList(int page, int rowCnt);
    public Notice getPrevById(int id);
    public Notice getNextById(int id);
    public int getCount();
}

