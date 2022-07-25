package com.llbz.web.dao;

import java.util.ArrayList;

import com.llbz.web.model.Notice;

public interface NoticeDaoable {
    public Notice getById(int id);
    public ArrayList<Notice> getList(int rowCnt);
}
