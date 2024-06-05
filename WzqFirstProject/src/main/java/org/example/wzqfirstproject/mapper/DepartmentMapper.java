package org.example.wzqfirstproject.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.*;
import org.example.wzqfirstproject.entity.Department;
import org.example.wzqfirstproject.entity.User;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface DepartmentMapper extends BaseMapper<Department> {
//    @Select("select * from department")
//    List<Department> GetAll();
//    @Select("select * from department where id=#{id}")
//    Department GetById(Integer id);
//    @Insert("insert into department (dept_name,description,address)" +
//            "values (#{dept_name},#{description},#{address})")
//    @Options(useGeneratedKeys = true,keyProperty = "id")
//    Integer DepartmentAdd(Department department);
//    @Delete("delete from department where id = #{id}")
//    Integer DepartmentDel(Integer id);
//    @Update("update department set dept_name=#{dept_name},description=#{description}" +
//            ",address=#{address}where id = #{id}")
//    Integer DepartmentUpdate(Department department);




}
