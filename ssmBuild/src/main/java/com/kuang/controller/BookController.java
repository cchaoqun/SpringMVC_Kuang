package com.kuang.controller;

import com.kuang.pojo.Books;
import com.kuang.service.BookService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Chaoqun Cheng
 * @date 2021-05-2021/5/26-1:33
 */
@Controller
@RequestMapping("/book")
public class BookController {
    //controller 调 service层
    @Autowired
    @Qualifier("BookServiceImpl")
    public BookService bookService;
    //==============================================查询==============================================
    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Books> list = bookService.queryAllBooks();
        model.addAttribute("list", list);
        return "allBook";
    }

    //==============================================添加==============================================
    //跳转到增加书籍页面
    @RequestMapping("/toAddBook")
    public String toAddBookPage(){
        return "addBook";
    }

    //添加书籍的请求
    @RequestMapping("/addBook")
    public String addBook(Books books){
        System.out.println("addBook=>"+books);
        bookService.addBook(books);
        return "redirect:/book/allBook"; //重定向到我们的@RequestMapping("/allBook")的请求
    }

    //==============================================修改==============================================
    //跳转到修改书籍页面
    @RequestMapping("/toUpdateBook")
    public String toUpdatePage(int id, Model model){
        Books books = bookService.queryBookById(id);
        model.addAttribute("QBook", books);
        return "updateBook";
    }

    //修改书籍
    @RequestMapping("/updateBook")
    public String updateBook(Books books){
        System.out.println("updateBook==>"+books);
        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }

    //==============================================删除==============================================
    //删除书籍
    @RequestMapping("/deleteBook/{bookId}")
    public String deleteBook(@PathVariable("bookId") int id){
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }

    //==============================================查询==============================================
    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName, Model model){
        Books books = bookService.queryBookByName(queryBookName);
        if(books==null){
            model.addAttribute("error1", "Book \""+queryBookName+"\" Not Found");
        }
        System.err.println("books=>"+books);
        ArrayList<Books> list = new ArrayList<>();
        list.add(books);
        model.addAttribute("list", list);
        return "allBook";
    }
    //==============================================模糊查询==============================================
    @RequestMapping("/queryBookLike")
    public String queryBookLike(String queryBookLike, Model model){
        List<Books> list = bookService.queryBookLike(queryBookLike);
        if(list==null || list.size()==0){
            model.addAttribute("error2", "Book Like \""+queryBookLike+"\" Not Found");
        }
        model.addAttribute("list", list);
        return "allBook";

    }

}
