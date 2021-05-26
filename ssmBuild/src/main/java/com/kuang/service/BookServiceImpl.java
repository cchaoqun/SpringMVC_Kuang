package com.kuang.service;

import com.kuang.dao.BookMapper;
import com.kuang.pojo.Books;

import java.util.List;

/**
 * @author Chaoqun Cheng
 * @date 2021-05-2021/5/26-0:40
 */

public class BookServiceImpl implements BookService {

    //service层调用Dao层, 组合Dao
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        System.out.println("BookServiceImpl:updateBook=>"+books);
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBooks() {
        return bookMapper.queryAllBooks();
    }

    public Books queryBookByName(String bookName) {
        return bookMapper.queryBookByName(bookName);
    }

    @Override
    public List<Books> queryBookLike(String bookNameLike) {
        //模糊查询左右加上%%
        return bookMapper.queryBookLike("%"+bookNameLike+"%");
    }
}
