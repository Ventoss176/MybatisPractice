import com.ventoss.mybatis.mapper.DeptMapper;
import com.ventoss.mybatis.mapper.DynamicSQLMapper;
import com.ventoss.mybatis.mapper.EmpMapper;
import com.ventoss.mybatis.pojo.Dept;
import com.ventoss.mybatis.pojo.Emp;
import com.ventoss.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * Date:2022/6/29
 * Author:Vent
 * Description:
 **/
public class EmpTest {
    // private SqlSessionUtil sqlSessionUtil;
    @Test
    public void EmpTest1(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        // DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        // List<Emp> allEmps = mapper.getAllEmps();
        // Dept deptEmpByDid = mapper.getDeptEmpByDid(1);
        // Dept deptByStep = mapper.getDeptByStep(1);
        Emp empByStep = mapper.getEmpByStep(1);
        System.out.println(empByStep);

        // allEmps.forEach(Emp -> System.out.println(Emp));

    }

    @Test
    public void testDy(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        // List<Emp> emp = mapper.getEmpListByMoreWH(new Emp(null, "张三", 21, "", "231@qq"));
        List<Emp> emp = mapper.getEmpListByMoreTJ(new Emp(null, "张三", 21, "", "231@qq"));


        System.out.println(emp);
    }
}
