package com.zking.spboot01.model;

import javax.persistence.*;

import java.io.Serializable;

/**
 * @author hui
 * @create 2019-12-17 18:41:10
 */

@Entity
@Table(name="studentinfo")
public class Student implements Serializable {


    @Id
    @GeneratedValue      //默认自增
    private Integer id;

    @Column(name="stu_name")    //数据库列与实体类属性不一致时配置
    private String stuname;
    private String sex;
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Student() {
    }

    public Student(String stuname, String sex, Integer age) {
        this.stuname = stuname;
        this.sex = sex;
        this.age = age;
    }
}
