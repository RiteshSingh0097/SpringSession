package question12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao1 {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void insertUserDao1(){
        String sql = "INSERT INTO student(id,name) VALUES(1,'Ritesh')";
        jdbcTemplate.update(sql);
    }
}
