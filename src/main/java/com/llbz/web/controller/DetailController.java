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
public class DetailController {
    @Autowired
    private NoticeServiceable noticeServiceable;

    @RequestMapping("detail")
    public void list(Model model, int id){
    
        Notice notice = noticeServiceable.getById(id);
        System.out.println(notice);
        model.addAttribute("notice", notice);

        
    }

    
    
}
