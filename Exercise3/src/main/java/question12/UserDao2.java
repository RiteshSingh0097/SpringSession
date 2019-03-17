package question12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserDao2 {

    @Autowired
    UserDao1 userDao1;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Transactional(propagation = Propagation.REQUIRED)
    public void insertUserDao2() {
        String sql = "INSERT INTO student(id,name) VALUES(1,'singh')";
        jdbcTemplate.update(sql);
        try {
            userDao1.insertUserDao1();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
