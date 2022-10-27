package com.ventoss.mybatis.mapper;

import com.ventoss.mybatis.pojo.Dept;
import com.ventoss.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Date:2022/6/29
 * Author:Vent
 * Description:
 **/
public interface EmpMapper {

    /**
     * 添加用户信息
     * @return
     */
    int insertEmp();

    /**
     * 添加用户信息
     * @param emp
     * @return
     * useGeneratedKeys：设置使用自增的主键
     * keyProperty：因为增删改有统一的返回值是受影响的行数，因此只能将获取的自增的主键放在传输的参
    数user对象的某个属性中
     */
    int insertEmp(Emp emp);

    /**
     * 删除用户
     */
    int deleteEmp(@Param("id") int id);

    /**
     * 修改
     * @return
     */
    int updateEmp();

    /**
     * 查询具体用户
     * @return
     */
    Emp getEmpById(@Param("id") int id);

    /**
     * 通过分步查询查询员工信息
     * @param eid
     * @return
     */
    Emp getEmpByStep(@Param("eid") int eid);
    // /**
    //  * 分步查询的第二步：根据员工所对应的did查询部门信息
    //  * @param did
    //  * @return
    //  */
    // Dept getEmpDeptByStep(@Param("did") int did);

    List<Emp> getEmpListByDid(@Param("did") int did);

    Emp getEmpAndDept(@Param("eid") int eid);

    List<Emp> getAllEmps();
    List<Map<String, Object>> getAllEmpsToMap();

    Map<String, Object> getEmpToMap(@Param("id") int id);

    int getCount();

    List<Emp> testMohu(@Param("mohu") String mohu);

    int deleteMore(@Param("ids") String ids);

    List<Emp> getAllEmps(@Param("tablename") String tablename);
}
