package com.ssm.entity;

/**
 * Created by zhengxgs on 2018/1/10.
 */
public class Book {

    private String bookId;
    private String bookName;
    private String number;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName=" + bookName +
                ", number=" + number +
                '}';
    }
}