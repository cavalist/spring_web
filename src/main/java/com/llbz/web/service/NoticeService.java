package com.llbz.web.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.llbz.web.dao.NoticeDaoable;
import com.llbz.web.model.Notice;

@Service
public class NoticeService implements NoticeServiceable {
    @Autowired
    private NoticeDaoable noticeDaoable;

    @Override
    public ArrayList<Notice> getList() {
        //실제 DB 칼럼명: id, title, writer_id, regdate, hit 
        ArrayList<Notice> noticeList;
        noticeList = noticeDaoable.getList(7);
        
        return noticeList;
    }

    @Override
    public Notice getById(int id) {
        Notice notice;
        notice = noticeDaoable.getById(id);
        return notice;
    }

}
