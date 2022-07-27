package com.llbz.web.service;

import java.util.ArrayList;

import com.llbz.web.model.Notice;
import com.llbz.web.model.Pager;

public interface NoticeServiceable {
    public ArrayList<Notice> getList(int page, int rowCnt, String filed, String query);
    public Notice getById(int id);
    public Notice getPrevById(int id);
    public Notice getNextById(int id);
    public int getCount(String filed, String query);
    public Pager getPager(int size, int page, int rowCnt, int noticeCount);

}
