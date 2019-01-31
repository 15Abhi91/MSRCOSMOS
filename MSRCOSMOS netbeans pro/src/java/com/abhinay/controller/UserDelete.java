/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abhinay.controller;

import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author aaditya raj
 */
public class UserDelete {
    public static String UserDelete(String Id) {
        String msg = null;
        String no = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mrs", "root", "");

//            String sql = ("DELETE FROM online_questions WHERE Q_id = '" + Id + "'");
            String sql = ("DELETE FROM `userRegis` WHERE `userRegis`.`id` = '" + Id + "'");
            java.sql.Statement st = con.createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            out.println(e);
        }
        return msg;
    }
    
}
