package com.ssm.dao;


import com.ssm.entity.Book;

/**
 * Created by zhengxgs on 2018/1/9.
 */
public interface DemoDao {

    int insert(Book book);

    Book selectBookById(String bookId);

}