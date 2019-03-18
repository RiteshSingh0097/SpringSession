package question12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class Mandate {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Transactional(propagation = Propagation.MANDATORY)
    public void insertUser() {
        String sql = "INSERT INTO student(id,name) VALUES(1,'Ritesh')";
        jdbcTemplate.update(sql);

    }
}
