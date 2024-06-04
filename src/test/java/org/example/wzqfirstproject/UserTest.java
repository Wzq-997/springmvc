//package org.example.wzqfirstproject;
//
//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//import org.example.wzqfirstproject.entity.Department;
//import org.example.wzqfirstproject.entity.User;
//import org.example.wzqfirstproject.mapper.UserMapper;
//import org.example.wzqfirstproject.vo.DeptVo;
//import org.example.wzqfirstproject.mapper.DepartmentMapper;
//import org.example.wzqfirstproject.mapper.DeptWithUserMapper;
//import org.junit.jupiter.api.Test;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.Date;
//import java.util.List;
//
//public class UserTest {
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
//    @Test
//    public void selectAllTest(){
//        SqlSession sqlSession = UserTest.getSqlSession();
//        DepartmentMapper mapper = sqlSession.getMapper(DepartmentMapper.class);
//        List<Department> departments = mapper.GetAll();
//        departments.forEach(department-> System.out.println(department.getId()));
//    }
//    @Test
//    public void findDept()
//    {
//        SqlSession sqlSession = UserTest.getSqlSession();
//        DeptWithUserMapper mapper = sqlSession.getMapper(DeptWithUserMapper.class);
//        DeptVo dept = mapper.findDept(1);
//        System.out.println(dept.toString());
//    }
//
//    //获取所有的用户
//    @Test
//    public void GetAll()
//    {
//        SqlSession sqlSession = UserTest.getSqlSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<User> users = mapper.GetAll();
//        for(User u : users)
//        {
//            System.out.println(u);
//        }
//    }
//
//    //根据id获取用户
//    @Test
//    public void GetById()
//    {
//        SqlSession sqlSession = UserTest.getSqlSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        User user = mapper.GetById(2);
//        System.out.println(user);
//    }
//
//    //根据id删除用户
//    @Test
//    public void UserDel()
//    {
//        SqlSession sqlSession = UserTest.getSqlSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        Integer i = mapper.UserDel(13);
//        System.out.println(i);
//    }
//    //根据id修改用户
//    @Test
//    public void UserAlert()
//    {
//        SqlSession sqlSession = UserTest.getSqlSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        Date date = new Date(1970,02,13);
//        User user = new User(12,"齐天大圣","qitiandasheng",1,date,2);
//        Integer i = mapper.UserUpdate(user);
//        System.out.println(i);
//    }
//
//    //添加用户
//    @Test
//    public void UserAdd()
//    {
//        SqlSession sqlSession = UserTest.getSqlSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        Date date = new Date(1970,02,13);
//        User user = new User(null,"齐天大圣","qitiandasheng",1,date,2);
//        Integer i = mapper.UserAdd(user);
//        System.out.println(i);
//    }
//}
