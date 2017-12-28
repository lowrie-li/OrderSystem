package com.SZNOTEC.OrderSystem.entity;

import java.util.Date;

public class User {
    private Integer userSNo;

    private String uid;

    private Integer empSno;

    private String pwd;

    private String email;

    private String cmt;

    private Date updateTime;

    public Integer getUserSNo() {
        return userSNo;
    }

    public void setUserSNo(Integer userSNo) {
        this.userSNo = userSNo;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public Integer getEmpSno() {
        return empSno;
    }

    public void setEmpSno(Integer empSno) {
        this.empSno = empSno;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getCmt() {
        return cmt;
    }

    public void setCmt(String cmt) {
        this.cmt = cmt == null ? null : cmt.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String toString() {
        return "User: {userSNo: " + userSNo +
                        ", uid: " + uid +
                        ", pwd: " + pwd +
                        ", email: " + email +
                        ", cmt: " + cmt +
                        ", updateTime: " + updateTime +
                "}";
    }
}