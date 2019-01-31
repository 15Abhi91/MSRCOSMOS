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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aaditya raj
 */
public class UserEditController {
         static ArrayList list;// = new ArrayList();

    public static List SelectUser(String id) {
         list = new ArrayList();
        PreparedStatement ps = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mrs", "root", "");

            ps = con.prepareStatement("SELECT * FROM `userRegis` WHERE id = '"+id+"'");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new com.abhinay.model.userEditModel(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5), rs.getString(6), rs.getString(7)));
            }
        } catch (Exception ex) {
            out.println(ex);
        }
        return list;
    }
        public static List SelectUser() {

            return list;
        }
}
