package pers.lilei.test.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * <h3>SpringTest</h3>
 * <p></p>
 *
 * @author : 李雷
 * @date : 2020-12-08 17:25
 **/
//增强类
@Component
@Aspect//生成代理对象
public class UserProxy {
    //前置通知
    //@Before注解 表示作为前置通知
    @Before(value = "execution(* pers.lilei.test.aop.User.add())")
    public void before() {
        System.out.println("before");
    }
}
