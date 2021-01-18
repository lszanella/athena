package com.project.olympus.athena.utils;

import oracle.jdbc.pool.OracleDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLConnector {
    public SQLConnector(){

    }

    String jdbcUrl = "jdbc:oracle:thin:@localhost:49161:XE";
    String userid = "app_user";
    String password = "app";
    Connection conn;

    public Connection getDBConnection() throws SQLException {
        OracleDataSource ds;
        ds = new OracleDataSource();
        ds.setURL(jdbcUrl);
        conn = ds.getConnection(userid, password);
        return (conn);
    }
}
