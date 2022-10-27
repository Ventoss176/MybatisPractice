package com.ventoss.mybatis.mapper;

import com.ventoss.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Date:2022/6/25
 * Author:Vent
 * Description:
 **/
public interface UserMapper {

    /**
     * 添加用户信息
     * @return
     */
    int insertUser();

    /**
     * 添加用户信息
     * @param user
     * @return
     * useGeneratedKeys：设置使用自增的主键
     * keyProperty：因为增删改有统一的返回值是受影响的行数，因此只能将获取的自增的主键放在传输的参
    数user对象的某个属性中
     */
    int insertUser(User user);

    /**
     * 删除用户
     */
    int deleteUser(@Param("id") int id);

    /**
     * 修改
     * @return
     */
    int updateUser();

    /**
     * 查询具体用户
     * @return
     */
    User getUserById(@Param("id") int id);

    List<User> getAllUsers();
    List<Map<String, Object>> getAllUsersToMap();

    Map<String, Object> getUserToMap(@Param("id") int id);

    int getCount();

    List<User> testMohu(@Param("mohu") String mohu);

    int deleteMore(@Param("ids") String ids);

    List<User> getAllUsers(@Param("tablename") String tablename);




}
