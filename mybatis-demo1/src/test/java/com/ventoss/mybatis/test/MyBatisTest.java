package com.ventoss.mybatis.test;

import com.ventoss.mybatis.mapper.UserMapper;
import com.ventoss.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Date:2022/6/27
 * Author:Vent
 * Description:
 **/
public class MyBatisTest {


    @Test
    public void testMyBatis() throws IOException {
        //读取配置的MyBatis的核心文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //创建SqlSessionFactoryBuilder对象并将对应配置文件字节流创建工厂类 生产SqlSession对象.
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //创建SqlSession对象，此时通过SqlSession对象所操作的sql都必须手动提交或回滚事务
        // SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建SqlSession对象，此时通过SqlSession对象所操作的sql都会自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int result = userMapper.insertUser();
        System.out.println("结果:" + result);



    }
    @Test
    public void testMyBatis2() throws IOException {
        //读取配置的MyBatis的核心文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //创建SqlSessionFactoryBuilder对象并将对应配置文件字节流创建工厂类 生产SqlSession对象.
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //创建SqlSession对象，此时通过SqlSession对象所操作的sql都必须手动提交或回滚事务
        // SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建SqlSession对象，此时通过SqlSession对象所操作的sql都会自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        // int result = userMapper.deleteUser();
        // List<User> users = userMapper.getAllUsers();
        // User userById = userMapper.getUserById(2);
        // Map<String, Object> userToMap = userMapper.getUserToMap(2);
        // int count = userMapper.getCount();
        // List<Map<String, Object>> allUsersToMap = userMapper.getAllUsersToMap();
        List<User> users = userMapper.testMohu("张");
        // int i = userMapper.deleteMore("2,3");
        // int i = userMapper.insertUser(new User(null, "李留", "aadd", 23, "男", null));
        System.out.println("结果:" + users);



    }

    public void testJDBC() throws ClassNotFoundException, SQLException {
        String username = "admin";
        Class.forName("");
        Connection connection = DriverManager.getConnection("","","");
        PreparedStatement ps = connection.prepareStatement("select * from where username = ?");
        ps.setString(1, username);

    }

}
