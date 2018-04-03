package com.ssm.controller;

import com.ssm.entity.Book;
import com.ssm.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/demo")
public class DemoController{

    @Resource
    private BookService bookService;

    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView view = new ModelAndView();
        view.setViewName("/index");
        view.addObject("name","小明");
        Book book = bookService.selectBookById("1000");
        System.out.println(book);
        return view;
    }

}