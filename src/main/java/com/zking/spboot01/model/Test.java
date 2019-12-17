package com.zking.spboot01.model;

import java.io.Serializable;

/**
 * @author hui
 * @create 2019-12-17 13:57:51
 */
public class Test implements Serializable {
    private int id;
    private String textname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTextname() {
        return textname;
    }

    public void setTextname(String textname) {
        this.textname = textname;
    }

    public Test(int id, String textname) {
        this.id = id;
        this.textname = textname;
    }

    public Test() {
    }
}
