package com.rambo.demo1.entity;

import javax.persistence.*;

/**
 * @Author: Rambo_yb
 * @Date: 2019/3/25 10:13
 * @Version 1.0
 */

@Entity
@Table(name="tb1_user")
public class User {
    /**  自增主键*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_name", length = 50)//这是和数据表对应的一个列
    private String userName;

    @Column(name = "user_age", length = 3)//这是和数据表对应的一个列
    private Integer userAge;

    @Column(name = "user_password", length = 30)//这是和数据表对应的一个列
    private String userPassword;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
