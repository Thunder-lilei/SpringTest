package pers.lilei.test.aop;

import org.springframework.stereotype.Component;

/**
 * <h3>SpringTest</h3>
 * <p></p>
 *
 * @author : 李雷
 * @date : 2020-12-08 16:49
 **/
public interface UserDao {
    public int add(int a,int b);
    public String update(String id);
}
