package com.kuang.dao;

import com.kuang.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Chaoqun Cheng
 * @date 2021-05-2021/5/26-0:23
 */

public interface BookMapper {

    //增加一本书
    int addBook(Books books);
    //删除一本书
    int deleteBookById(@Param("bookId") int id);
    //更新一本书
    int updateBook(Books books);
    //查询一本书
    Books queryBookById(@Param("bookId") int id);
    //查询所有的书
    List<Books> queryAllBooks();

    //根据书名查询书
    Books queryBookByName(@Param("bookName") String bookName);

    //模糊查询
    List<Books> queryBookLike(@Param("bookNameLike") String bookNameLike);
}
