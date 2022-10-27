package com.ventoss.mybatis.mapper;

import com.ventoss.mybatis.pojo.Emp;

import java.util.List;

/**
 * Date:2022/6/30
 * Author:Vent
 * Description:
 **/
public interface DynamicSQLMapper {
    /**
     * 多条件查询
     */
    List<Emp> getEmpByCondition(Emp emp);

    List<Emp> getEmpListByMoreWH(Emp emp);
    List<Emp> getEmpListByMoreTJ(Emp emp);
    List<Emp> getEmpListByChoose(Emp emp);
}
