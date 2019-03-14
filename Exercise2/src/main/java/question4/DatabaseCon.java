package question4;

public class DatabaseCon {

    private Integer port;
    private String name;

    public void connect() {
        System.out.println("<----------------connecting------------------->");
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
