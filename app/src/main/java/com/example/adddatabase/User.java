package com.example.adddatabase;

public class User {
    String name;
    String email;
    String mobile_no;

    public User(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public String getAdderss() {
        return adderss;
    }

    public void setAdderss(String adderss) {
        this.adderss = adderss;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    String adderss;
    String pass;

    public User(String name, String email, String mobile_no, String adderss, String pass) {
        this.name = name;
        this.email = email;
        this.mobile_no = mobile_no;
        this.adderss = adderss;
        this.pass = pass;
    }
}
