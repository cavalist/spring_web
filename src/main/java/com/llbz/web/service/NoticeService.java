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
    public ArrayList<Notice> getNoticeList() {
        ArrayList<Notice> noticeList;
        noticeList = noticeDaoable.getList(10);

        

        
        return noticeList;
    }
    

}
