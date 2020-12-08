package pers.lilei.test.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * <h3>SpringTest</h3>
 * <p></p>
 *
 * @author : 李雷
 * @date : 2020-12-08 20:50
 **/
@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addMoney() {
        String sql = "update user set money = money-? where name = ?";
        jdbcTemplate.update(sql,100,"lilei");
    };

    public void reduceMoney() {
        String sql = "update user set money = money+? where name = ?";
        jdbcTemplate.update(sql,100,"wang");
    }
}
