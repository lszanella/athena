package com.project.olympus.athena.controller;

import com.project.olympus.athena.model.TestObject;
import com.project.olympus.athena.utils.SQLConnector;
import com.project.olympus.athena.utils.SQLConsult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@RestController
public class SQLControler {
    SQLConsult sqlc = new SQLConsult();
    @RequestMapping("/")
    public TestObject consultTable() throws SQLException {
         return sqlc.consulta();
    }

}
