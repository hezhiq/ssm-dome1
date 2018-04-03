package com.ssm.service;

import com.ssm.entity.Book;
import org.springframework.stereotype.Service;

/**
 * Created by zhengxgs on 2017/12/28.
 */
@Service
public interface BookService {

    int insert(Book book);

    Book selectBookById(String bookId);

}