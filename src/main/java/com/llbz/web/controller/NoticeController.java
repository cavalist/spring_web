package com.llbz.web.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.llbz.web.model.Notice;
import com.llbz.web.model.Pager;
import com.llbz.web.service.NoticeServiceable;

@Controller
@RequestMapping("/notice/")
public class NoticeController {
    private final int pagerSize = 5;
    
    @Autowired
    private NoticeServiceable noticeServiceable;

    @RequestMapping("list")
    public void list(
        Model model, 
        @RequestParam(name="p", defaultValue = "1") int page,
        @RequestParam(name="f", defaultValue = "title")String filed,
        @RequestParam(name="q", defaultValue = "")String query,
        @RequestParam(name="r", defaultValue = "7")int rowCnt
        ) {
        
        model.addAttribute("p", page);
        model.addAttribute("f", filed);
        model.addAttribute("q", query);
        
        ArrayList<Notice> noticeList = noticeServiceable.getList(page, rowCnt, filed, query);
        model.addAttribute("noticeList", noticeList);
        
        int noticeCount = noticeServiceable.getCount(filed, query);

        Pager pager = noticeServiceable.getPager(pagerSize, page, rowCnt, noticeCount);
        model.addAttribute("pager", pager);
    
    }

    @RequestMapping("detail")
    public void detail(Model model, int id) {

        Notice notice = noticeServiceable.getById(id);
        Notice prevNotice = noticeServiceable.getPrevById(id);
        Notice nextNotice = noticeServiceable.getNextById(id);
        model.addAttribute("notice", notice);
        model.addAttribute("prevNotice", prevNotice);
        model.addAttribute("nextNotice", nextNotice);

    }
}
