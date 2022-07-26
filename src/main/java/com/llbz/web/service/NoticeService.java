package com.llbz.web.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.llbz.web.dao.NoticeDaoable;
import com.llbz.web.model.Notice;
import com.llbz.web.model.Pager;

@Service
public class NoticeService implements NoticeServiceable {
    @Autowired
    private NoticeDaoable noticeDaoable;

    @Override
    public ArrayList<Notice> getList(int page, int rowCnt) {
        //실제 DB 칼럼명: id, title, writer_id, regdate, hit 
        ArrayList<Notice> noticeList;
        noticeList = noticeDaoable.getList(page, rowCnt);
        
        return noticeList;
    }
    @Override
    public ArrayList<Notice> getList(int rowCnt) {
        ArrayList<Notice> noticeList;
        noticeList = getList(1, rowCnt);
        
        return noticeList;
    }

    @Override
    public Notice getById(int id) {
        Notice notice;
        notice = noticeDaoable.getById(id);
        return notice;
    }

    @Override
    public Notice getPrevById(int id) {
        Notice notice;
        notice = noticeDaoable.getPrevById(id);
        return notice;
    }

    @Override
    public Notice getNextById(int id) {
        Notice notice;
        notice = noticeDaoable.getNextById(id);
        return notice;
    }
    @Override
    public int getCount() {
        int cnt = noticeDaoable.getCount();
        return cnt;
    }
    @Override
    public int getPagerStartPage(int page, int pagerSize) {
        int pagerStartPage = page - ((page + pagerSize - 1) % pagerSize);

        return pagerStartPage;
    }
    @Override
    public Pager getPager(int size, int page, int rowCnt) {
        Pager pager = new Pager();
        
        pager.setSize(size);

        int noticeCount = getCount();
        int pagerCount = noticeCount / rowCnt;
        if (noticeCount % rowCnt > 0)
            pagerCount += 1;

        pager.setCount(pagerCount);
        
        int viewStart = page - ((page + size - 1) % size);
        int viewEnd = viewStart + size - 1;

        pager.setViewStart(viewStart);
        pager.setViewEnd(viewEnd);
        return pager;
    }
    

}
