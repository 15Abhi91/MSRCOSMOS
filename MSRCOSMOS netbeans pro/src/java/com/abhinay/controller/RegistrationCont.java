package com.abhinay.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author aaditya raj
 */
public class RegistrationCont {
    public static String insertRegis(String F_name, String M_name, String L_name, String Email, String mobile, String pass){
        String msg = null;
        try{
            int res=0;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mrs", "root", "");

            String sql = ("INSERT INTO `userRegis` (`F_Name`, `M_Name`, `L_Name`, `email`, `phone`, `password`) VALUES ( ?, ?, ?, ?, ?, ?);");
//            Statement stat = null;
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, F_name);
            ps.setString(2, M_name);
            ps.setString(3, L_name);
            ps.setString(4, mobile);
            ps.setString(5, Email);
            ps.setString(6, pass);
            ps.executeUpdate();
            res = 1;
            if(res ==1)
            {
                msg = "Data Submites Sucessfully";
            }
            else{
                msg = "Error...!";
            }
          
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        return msg;
    }
    
//    public static void main(String[] args) {
//        insertRegis("sd","sad","sad","sad","asd","sad");
//    }
    
}
