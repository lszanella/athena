package com.project.olympus.athena.utils;

import com.project.olympus.athena.model.TestObject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SQLConsult  {
    public TestObject consulta() throws SQLException {

        Connection c = new SQLConnector().getDBConnection();
        String query = "select sysdate as teste from dual";
        TestObject tsto = new TestObject();

        try (Statement stmt = c.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            ArrayList<String> rsnext = new ArrayList<String>();

            while (rs.next()) {
                String tst = rs.getString("teste");
                rsnext.add(tst);
            }
            tsto.setTeste(rsnext);
            return tsto;
        } catch (SQLException e) {
            throw new SQLException("Erro na consulta do SQL: " + e.getMessage());
        }
    }

}
