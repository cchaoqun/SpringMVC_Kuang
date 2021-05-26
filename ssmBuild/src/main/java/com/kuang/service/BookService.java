package com.kuang.service;

import com.kuang.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Chaoqun Cheng
 * @date 2021-05-2021/5/26-0:40
 */

public interface BookService {
    //增加一本书
    int addBook(Books books);
    //删除一本书
    int deleteBookById( int id);
    //更新一本书
    int updateBook(Books books);
    //查询一本书
    Books queryBookById( int id);
    //查询所有的书
    List<Books> queryAllBooks();

    //根据书名查询书
    Books queryBookByName(@Param("bookName") String bookName);

    //模糊查询
    List<Books> queryBookLike(@Param("bookNameLike") String bookNameLike);
}
