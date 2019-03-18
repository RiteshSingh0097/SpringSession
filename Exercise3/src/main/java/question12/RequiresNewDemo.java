package question12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class RequiresNewDemo {

    @Autowired
    UserDao1 userDao;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Transactional(propagation = Propagation.REQUIRED)
    public void insertUser() {
        String sql = "INSERT INTO student(id,name) VALUES(2,'singh')";
        jdbcTemplate.update(sql);
        try {
            userDao.insertUserDao();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
