package com.oop.mahadi.bookinformationinatable;

public class BookInfo {
    private String bookName,bookId,publisher,Author,authorPin;
    private Integer page;

    public BookInfo(String bookName, String bookId, String publisher, String author, String authorPin, Integer page) {
        this.bookName = bookName;
        this.bookId = bookId;
        this.publisher = publisher;
        Author = author;
        this.authorPin = authorPin;
        this.page = page;
    }

    @Override
    public String toString() {
        return "BookInfo{" +
                "bookName='" + bookName + '\'' +
                ", bookId='" + bookId + '\'' +
                ", publisher='" + publisher + '\'' +
                ", Author='" + Author + '\'' +
                ", authorPin='" + authorPin + '\'' +
                ", page=" + page +
                '}';
    }

    public BookInfo() {
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public String getAuthorPin() {
        return authorPin;
    }

    public void setAuthorPin(String authorPin) {
        this.authorPin = authorPin;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
}
