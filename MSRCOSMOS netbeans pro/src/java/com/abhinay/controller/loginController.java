/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abhinay.controller;

import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author aaditya raj
 */
public class loginController {
    public static String login(String email, String password) {
        String msg = null;
        String no = null;
            PreparedStatement ps = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mrs", "root", "");

            String sql = ("SELECT * FROM `userRegis` where email = '"+email+"'");
            ResultSet rs = ps.executeQuery();
   
//        session.setAttribute("id", email);
      
        while (rs.next()) {
            if (rs.getString(5).equals(email) && rs.getString(7).equals(password)) {
               msg = "ok";
            } 
            else{
                msg="error";
            }
        }
            
//            java.sql.Statement st = con.createStatement();
//            st.executeUpdate(sql);
        } catch (Exception e) {
            out.println(e);
        }
        return msg;
    }
   
}
