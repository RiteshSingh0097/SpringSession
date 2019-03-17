package question3_4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConn {

    ApplicationContext apx = new ClassPathXmlApplicationContext("qus3_4.xml");
    DataSource dataSource = apx.getBean("dataSource", DataSource.class);
    DataSource dataSource2 = apx.getBean("dataSource2", DataSource.class);
    DataSource dataSource3 = apx.getBean("dataSource3", DataSource.class);

    public void print1() throws SQLException {
        PreparedStatement preparedStatement = dataSource.getConnection().prepareStatement("SELECT * FROM user");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getString("name"));
        }
    }

    public void print2() throws SQLException {
        PreparedStatement preparedStatement = dataSource2.getConnection().prepareStatement("SELECT * FROM user");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getString("age"));
        }
    }

    public void print3() throws SQLException {
        PreparedStatement preparedStatement = dataSource3.getConnection().prepareStatement("SELECT * FROM user");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getString("username"));
        }
    }

    public static void main(String[] args) throws SQLException {
        DatabaseConn databaseConn = new DatabaseConn();

        databaseConn.print1();
        databaseConn.print2();
        databaseConn.print3();
    }
}
