//package org.example.wzqfirstproject;
//
//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//import org.example.wzqfirstproject.entity.Department;
//import org.example.wzqfirstproject.entity.User;
//import org.example.wzqfirstproject.mapper.DepartmentMapper;
//import org.example.wzqfirstproject.mapper.UserMapper;
//import org.junit.jupiter.api.Test;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.List;
//
//public class DepartmentTest {
//    private static SqlSession getSqlSession() {
//        //读取MyBaits的核心配置文件
//        InputStream is = null;
//        try {
//            is = Resources.getResourceAsStream("mybatis-config.xml");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        //创建SqlSessionFactory对象(通过创建SqlSessionFactoryBuilder来进行获取)
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
//        //创建sqlSession对象（MyBatis的操作数据库的会话对象，通过此对象可以获取SQL语句，并执行）
//        //注意：openSession对象默认是不会进行自动的事务提交的,所以我们如果想做DML操作并且自动事务提交，需要加上true参数，默认为false
//        SqlSession sqlSession = sqlSessionFactory.openSession(true);
//        return sqlSession;
//
//    }
//    //根据id获取部门
//    @Test
//    public void GetById()
//    {
//        SqlSession sqlSession = DepartmentTest.getSqlSession();
//        DepartmentMapper mapper = sqlSession.getMapper(DepartmentMapper.class);
//        Department department = mapper.GetById(2);
//        System.out.println(department);
//    }
//    //获取部门
//    @Test
//    public void GetAll()
//    {
//        SqlSession sqlSession = DepartmentTest.getSqlSession();
//        DepartmentMapper mapper = sqlSession.getMapper(DepartmentMapper.class);
//        List<Department> departments = mapper.GetAll();
//        for(Department d : departments)
//        {
//            System.out.println(d);
//        }
//    }
//    //删除部门
//    @Test
//    public void DepartmentDel()
//    {
//        SqlSession sqlSession = DepartmentTest.getSqlSession();
//        DepartmentMapper mapper = sqlSession.getMapper(DepartmentMapper.class);
//        Integer i = mapper.DepartmentDel(4);
//        System.out.println(i);
//    }
//    //添加部门
//    @Test
//    public void DepartmentAdd()
//    {
//        SqlSession sqlSession = DepartmentTest.getSqlSession();
//        DepartmentMapper mapper = sqlSession.getMapper(DepartmentMapper.class);
//        Department department = new Department(null,"财务部","负责薪资的计算","204");
//        Integer i = mapper.DepartmentAdd(department);
//        System.out.println(i);
//    }
//}
