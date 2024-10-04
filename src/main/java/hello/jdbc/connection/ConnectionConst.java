package hello.jdbc.connection;

public abstract class ConnectionConst { //객체 생성을 막기 위한 abstract
    public static final String URL = "jdbc:h2:tcp://localhost/~/test";
    public static final String USER = "sa";
    public static final String PASSWORD = "";
}
