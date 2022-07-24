package com.llbz.web.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.llbz.web.model.Notice;
import com.llbz.web.service.NoticeServiceable;

@Controller
@RequestMapping("/notice/")
public class NoticeController {
    @Autowired
    private NoticeServiceable noticeServiceable;

    @RequestMapping("list")
    public void list(Model model){
    
        System.out.println("noticeController Test");
        ArrayList<Notice> noticeList = noticeServiceable.getNoticeList();
        model.addAttribute("noticeList", noticeList);

        
    }

    
    
}
