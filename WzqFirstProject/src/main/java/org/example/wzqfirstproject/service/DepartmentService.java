package org.example.wzqfirstproject.service;

import org.example.wzqfirstproject.entity.Department;
import org.example.wzqfirstproject.entity.User;
import org.example.wzqfirstproject.vo.DeptVo;

import java.util.ArrayList;
import java.util.List;

public interface DepartmentService {
    //查询所有部门
    List<Department> GetAll();
    //获取单个
    Department GetById(Integer id);
    //添加
    Integer DepartmentAdd(Department department);
    //删除
    Integer DepartmentDel(Integer id);
    //修改
    Integer DepartmentUpdate(Department department);

    //
    DeptVo findDept(Integer id);
    //批量添加
    void batch(ArrayList<Department> departments);
    void batchDel(int[] departmentid);
}
