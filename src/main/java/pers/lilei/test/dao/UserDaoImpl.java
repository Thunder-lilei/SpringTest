package pers.lilei.test.dao;

import org.springframework.stereotype.Repository;

/**
 * <h3>SpringTest</h3>
 * <p></p>
 *
 * @author : 李雷
 * @date : 2020-12-08 09:29
 **/
@Repository
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("UserDao");
    }
}
