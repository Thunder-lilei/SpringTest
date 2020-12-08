import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.lilei.test.bean.Orders;
import pers.lilei.test.config.SpringConfig;
import pers.lilei.test.po.*;
import pers.lilei.test.service.UserService;

/**
 * <h3>SpringTest</h3>
 * <p></p>
 *
 * @author : 李雷
 * @date : 2020-12-07 17:39
 **/
public class Test {
    @org.junit.jupiter.api.Test
    public void addTest() {
        //加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //获取配置创建的对象
        User user = context.getBean("user", User.class);

        System.out.println(user);
        user.add();
    }
    @org.junit.jupiter.api.Test
    public void addTest2() {
        //加载Spring配置文件
        BeanFactory context = new ClassPathXmlApplicationContext("bean.xml");
        //获取配置创建的对象
        User user = context.getBean("user", User.class);

        System.out.println(user);
        user.add();
    }
    @org.junit.jupiter.api.Test
    public void addTest3() {
        //加载Spring配置文件
        BeanFactory context = new ClassPathXmlApplicationContext("bean.xml");
        //获取配置创建的对象
        Book book = context.getBean("book", Book.class);
        book.toString();
    }
    @org.junit.jupiter.api.Test
    public void addTest4() {
        //加载Spring配置文件
        BeanFactory context = new ClassPathXmlApplicationContext("beanOut.xml");
        //获取配置创建的对象
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
    @org.junit.jupiter.api.Test
    public void addTest5() {
        //加载Spring配置文件
        BeanFactory context = new ClassPathXmlApplicationContext("beanIn.xml");
        //获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);
        emp.sout();
    }
    @org.junit.jupiter.api.Test
    public void addTest6() {
        //加载Spring配置文件
        BeanFactory context = new ClassPathXmlApplicationContext("beanArray.xml");
        //获取配置创建的对象
        Data data = context.getBean("data", Data.class);
        data.test();
    }
//    @org.junit.jupiter.api.Test
//    public void addTest7() {
//        //加载Spring配置文件
//        BeanFactory context = new ClassPathXmlApplicationContext("beanArrayOut.xml");
//        //获取配置创建的对象
//        Data data = context.getBean("data", Data.class);
//        data.test();
//    }
    @org.junit.jupiter.api.Test
    public void addTest8() {
        //加载Spring配置文件
        BeanFactory context = new ClassPathXmlApplicationContext("beanFactory.xml");
        //获取配置创建的对象
        Book book = context.getBean("myBean", Book.class);
        System.out.println(book.toString());
    }
    @org.junit.jupiter.api.Test
    public void addTest9() {
        //加载Spring配置文件
        BeanFactory context = new ClassPathXmlApplicationContext("beanFactory.xml");
        //获取配置创建的对象
        Book book1 = context.getBean("myBean", Book.class);
        Book book2 = context.getBean("myBean", Book.class);
        System.out.println(book1);
        System.out.println(book2);


        //加载Spring配置文件
        BeanFactory context2 = new ClassPathXmlApplicationContext("bean.xml");
        //获取配置创建的对象
        Book book3 = context2.getBean("book", Book.class);
        Book book4 = context2.getBean("book", Book.class);
        System.out.println(book3);
        System.out.println(book4);
    }
    @org.junit.jupiter.api.Test
    public void addTest10() {
//        //加载Spring配置文件
//        ApplicationContext context = new ClassPathXmlApplicationContext("beanOrders.xml");
        //加载Spring配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanOrders.xml");
        //获取配置创建的对象
        Orders orders = context.getBean("order", Orders.class);
        System.out.println("第四步 获取对象");
        System.out.println(orders);

        //手动bean销毁
//        ((ClassPathXmlApplicationContext)context).close();
        context.close();
    }
    @org.junit.jupiter.api.Test
    public void addTest11() {
        //加载Spring配置文件
        BeanFactory context = new ClassPathXmlApplicationContext("beanAutowire.xml");
        //获取配置创建的对象
        pers.lilei.test.autowire.Emp emp = context.getBean("emp", pers.lilei.test.autowire.Emp.class);
        System.out.println(emp);
        emp.test();
    }
    @org.junit.jupiter.api.Test
    public void addTest12() {
        //加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("Autowire.xml");
        //获取配置创建的对象
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
    @org.junit.jupiter.api.Test
    public void addTest13() {
        //加载Spring配置文件
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        //获取配置创建的对象
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
    @org.junit.jupiter.api.Test
    public void addTest14() {
        //加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("beanAspectJ.xml");
        //获取配置创建的对象
        pers.lilei.test.aop.User user = context.getBean("user", pers.lilei.test.aop.User.class);
        user.add();
    }
    @org.junit.jupiter.api.Test
    public void addTest15() {
        //加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("beanAopXml.xml");
        //获取配置创建的对象
        pers.lilei.test.aopxml.Book book = context.getBean("book", pers.lilei.test.aopxml.Book.class);
        book.buy();
    }
    @org.junit.jupiter.api.Test
    public void addTest16() {
        //加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("pers/lilei/test/transaction/beanTransaction.xml");
        //获取配置创建的对象
        pers.lilei.test.transaction.UserService userService = context.getBean("userService", pers.lilei.test.transaction.UserService.class);
        userService.accountMoney();
    }

}
