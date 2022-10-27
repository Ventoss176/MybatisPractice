package com.ventoss.mybatis.mapper;

import com.ventoss.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

/**
 * Date:2022/6/30
 * Author:Vent
 * Description:
 **/
public interface DeptMapper {

    Dept getEmpDeptByStep(@Param("did") int did);
    /**
     * 根据部门id查新部门以及部门中的员工信息
     * @param did
     * @return
     */
    Dept getDeptEmpByDid(@Param("did") int did);


    /**
     * 分步查询部门和部门中的员工
     * @param did
     * @return
     */
    Dept getDeptByStep(@Param("did") int did);


}
