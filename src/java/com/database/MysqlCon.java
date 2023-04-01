/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author suckm
 */
public class MysqlCon {
    Connection con = null;
    public Connection connector(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/SOC";
            String username = "root";
            String password = "1";
            con = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            
        }
        return con;
    }
}
