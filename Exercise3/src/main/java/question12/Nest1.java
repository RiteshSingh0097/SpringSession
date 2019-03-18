package question12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class Nest1 {

    @Autowired
    Nest2 nest2;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Transactional(propagation = Propagation.REQUIRED)
    public void insertUserDao() {
        String sql = "INSERT INTO student(id,name) VALUES(1,'Singh')";
        jdbcTemplate.update(sql);
        try {
            nest2.insertUserDao();
        } catch (Exception e) {
        }

    }
}
