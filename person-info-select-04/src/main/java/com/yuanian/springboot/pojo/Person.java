package com.yuanian.springboot.pojo;

public class Person {
    private String userCode;      //工号
    private String userName;      //姓名
    private String department;    //部门

    public Person(String userCode, String userName, String department) {
        this.userCode = userCode;
        this.userName = userName;
        this.department = department;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
