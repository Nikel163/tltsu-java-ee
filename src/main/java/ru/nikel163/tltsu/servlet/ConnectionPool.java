package ru.nikel163.tltsu.servlet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;

public class ConnectionPool {

    private static ConnectionPool instance = null;

    private ConnectionPool(){}

    public static ConnectionPool getInstance() {
        if (instance == null) {
            instance = new ConnectionPool();
        }
        return instance;
    }

    public Connection getConnection() {
        Connection connection = null;
        Context context;

        try {
            context = new InitialContext();
            DataSource dataSource = (DataSource) context.lookup("java:comp/env/jdbc/tltsuDB");
            connection = dataSource.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return connection;
    }
}
