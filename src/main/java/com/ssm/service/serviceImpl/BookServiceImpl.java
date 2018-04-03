package com.ssm.service.serviceImpl;

import com.ssm.dao.DemoDao;
import com.ssm.entity.Book;
import com.ssm.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zhengxgs on 2018/1/10.
 */
@Service("MavenService")
public class BookServiceImpl implements BookService {

    @Resource
    private DemoDao demoDao;

    public int insert(Book book) {
        return demoDao.insert(book);
    }

    public Book selectBookById(String bookId) {
        Book book = demoDao.selectBookById(bookId);
        return book;
    }
}