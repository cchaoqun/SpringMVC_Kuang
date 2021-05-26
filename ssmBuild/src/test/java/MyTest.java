import com.kuang.pojo.Books;
import com.kuang.service.BookService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author Chaoqun Cheng
 * @date 2021-05-2021/5/26-1:59
 */

public class MyTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl =(BookService) context.getBean("BookServiceImpl");
        for(Books books:bookServiceImpl.queryAllBooks()){
            System.out.println(books);
        }


    }

}
