package com.llbz.web.service;

import java.util.ArrayList;

import com.llbz.web.model.Notice;

public interface NoticeServiceable {
    public ArrayList<Notice> getList();

    public Notice getById(int id);
}
