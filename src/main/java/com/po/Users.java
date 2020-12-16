package com.po;

import java.io.Serializable;

public class Users implements Serializable {
    private String name;
    private String passwd;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", passwd='" + passwd + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public Users(String name, String passwd) {
        this.name = name;
        this.passwd = passwd;
    }

    public Users() {
    }
}
