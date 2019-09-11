/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegekart.pojo;

import java.util.Objects;

/**
 *
 * @author JAIN
 */
public class userPojo {

   

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress;
    }

    public double getUmob() {
        return umob;
    }

    public void setUmob(double umob) {
        this.umob = umob;
    }

    public String getUsercollege() {
        return usercollege;
    }

    public void setUsercollege(String usercollege) {
        this.usercollege = usercollege;
    }
    public userPojo() {
    }
    

    public userPojo(int userid, String username, String userpassword, String useraddress, double umob, String usercollege) {
        this.userid = userid;
        this.username = username;
        this.userpassword = userpassword;
        this.useraddress = useraddress;
        this.umob = umob;
        this.usercollege = usercollege;
    }
    private int userid;
    private String username;
    private String userpassword;
    private String useraddress;
    private double umob;
    private String usercollege;
    
    
}
