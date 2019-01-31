/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abhinay.model;

/**
 *
 * @author aaditya raj
 */
public class UserList {
    private int id;
    private String F_name;
    private String M_name;
    private String L_name;
    private String email;
    private String mobile;
    private String password;

    public UserList(int id, String F_name, String M_name, String L_name, String email, String mobile, String password) {
        this.id =id;
        this.F_name= F_name;
        this.M_name= M_name;
        this.L_name= L_name;
        this.email= email;
        this.mobile= mobile;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getF_name() {
        return F_name;
    }

    public void setF_name(String F_name) {
        this.F_name = F_name;
    }

    public String getM_name() {
        return M_name;
    }

    public void setM_name(String M_name) {
        this.M_name = M_name;
    }

    public String getL_name() {
        return L_name;
    }

    public void setL_name(String L_name) {
        this.L_name = L_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
