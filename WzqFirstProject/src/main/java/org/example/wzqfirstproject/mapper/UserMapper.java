package org.example.wzqfirstproject.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.*;
import org.example.wzqfirstproject.entity.User;
import org.example.wzqfirstproject.vo.UserVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper extends BaseMapper<User> {
//    @Select("select * from user")
//    List<User> GetAll();
//    @Select("select * from user where id = #{id}")
//    User GetById(Integer id);
//    @Insert("insert into user (user_name,password,gender,birthday,dept_id) " +
//            "values (#{user_name},#{password},#{gender},#{birthday},#{dept_id})")
//    @Options(useGeneratedKeys = true,keyProperty = "id")
//    Integer UserAdd(User user);
//    @Delete("delete from user where id = #{id} ")
//    Integer UserDel(Integer id);
//    @Update("update user set user_name=#{user_name},password=#{password}" +
//            ",gender=#{gender},birthday=#{birthday},dept_id=#{dept_id} where id = #{id}")
//    Integer UserUpdate(User user);

    //员工和部门联合查询
    @Select("select * from user u left join department d on u.dept_id = d.id")
    List<UserVo> GetAllUD();
}
