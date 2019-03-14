package question6;

import lombok.Getter;
import lombok.Setter;

import java.io.IOException;

@Getter
@Setter
public class Database {

    private Integer port;
    private String name;

    public void connect() throws IOException {
        System.out.println("<<<<<<<<<<<<<connecting>>>>>>>>>>>>>>.");
        throw new IOException();
    }
}
