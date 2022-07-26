package com.llbz.web.service;

import java.util.ArrayList;

import com.llbz.web.model.Notice;
import com.llbz.web.model.Pager;

public interface NoticeServiceable {
    public ArrayList<Notice> getList(int page, int rowCnt);
    public ArrayList<Notice> getList(int rowCnt);
    public Notice getById(int id);
    public Notice getPrevById(int id);
    public Notice getNextById(int id);
    public int getCount();
    public int getPagerStartPage(int page, int pagerSize);
    public Pager getPager(int size, int page, int rowCnt);

}
