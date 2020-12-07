import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.lilei.test.po.User;

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
}
