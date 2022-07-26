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
    private final int rowCnt = 7;
    private final int pagerSize = 5;
    
    @Autowired
    private NoticeServiceable noticeServiceable;

    @RequestMapping("list")
    public void list(Model model, @RequestParam(name="page", defaultValue = "1") int page) {

        model.addAttribute("page", page);
        
        ArrayList<Notice> noticeList = noticeServiceable.getList(page, rowCnt);
        model.addAttribute("noticeList", noticeList);

        Pager pager = noticeServiceable.getPager(pagerSize, page, rowCnt);
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
