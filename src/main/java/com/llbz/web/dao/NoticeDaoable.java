package com.llbz.web.dao;

import java.util.ArrayList;

import com.llbz.web.model.Notice;

public interface NoticeDaoable {
    public ArrayList<Notice> getList(int postCnt);
}
