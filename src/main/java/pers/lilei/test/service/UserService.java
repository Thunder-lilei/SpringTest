package pers.lilei.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import pers.lilei.test.dao.UserDao;

/**
 * <h3>SpringTest</h3>
 * <p></p>
 *
 * @author : 李雷
 * @date : 2020-12-08 09:28
 **/
//value可以不写，默认是首字母小写的类名称
//以下四个注解都可以
//@Component
@Service
//@Controller
//@Repository
public class UserService {

    @Value(value = "lilei")
    private String name;
    //不需要set方法
    //根据类型注入
    @Autowired
    private UserDao userDao;

    @Override
    public String toString() {
        return "UserService{" +
                "userDao=" + userDao +
                '}';
    }

    public void add() {
        System.out.println("service"+this.name);
        userDao.add();
    }
}
