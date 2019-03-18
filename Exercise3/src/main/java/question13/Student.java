package question13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class Student {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Transactional(readOnly= true)
    public void countStudent() {
        String sql = "select count(*) from student";
        System.out.println(jdbcTemplate.queryForObject(sql,Integer.class));
    }

    @Transactional(timeout = 2)
    public void getStudent(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
    }

    @Transactional(noRollbackFor = ArithmeticException.class)
    public void countStudent2() {
        String sql = "select count(*) from student";
        System.out.println(jdbcTemplate.queryForObject(sql,Integer.class));
        int c = 1/0;
    }

    @Transactional(rollbackFor = ArithmeticException.class)
    public void countStudent3() {
        String sql = "select count(*) from student";
        System.out.println(jdbcTemplate.queryForObject(sql,Integer.class));
        int c = 1/0;
    }
}
