package pers.lilei.test.factorybean;

import org.springframework.beans.factory.FactoryBean;
import pers.lilei.test.po.Book;
import pers.lilei.test.po.Data;
import pers.lilei.test.po.User;

/**
 * <h3>SpringTest</h3>
 * <p></p>
 *
 * @author : 李雷
 * @date : 2020-12-08 11:00
 **/
public class MyBean implements FactoryBean<Book> {

    //定义返回bean
    @Override
    public Book getObject() throws Exception {
        Book book = new Book();
        book.setBname("倚天屠龙记");
        return book;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
