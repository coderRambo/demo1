package com.rambo.demo1.repository;

import com.rambo.demo1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: Rambo_yb
 * @Date: 2019/3/25 10:17
 * @Version 1.0
 */
/**
 * 继承JpaRepository来完成对数据库表的操作
 */
public interface UserRepository extends JpaRepository<User,Integer> {
}
