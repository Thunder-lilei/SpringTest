package pers.lilei.test.aop;

import org.springframework.stereotype.Component;

/**
 * <h3>SpringTest</h3>
 * <p></p>
 *
 * @author : 李雷
 * @date : 2020-12-08 17:36
 **/
@Component
public class User {
    public void add() {
        System.out.println("add");
    }
}
