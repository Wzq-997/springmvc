package org.example.wzqfirstproject.service.Impl;

import org.example.wzqfirstproject.entity.Department;
import org.example.wzqfirstproject.entity.User;
import org.example.wzqfirstproject.vo.DeptVo;
import org.example.wzqfirstproject.mapper.DepartmentMapper;
import org.example.wzqfirstproject.mapper.DeptWithUserMapper;
import org.example.wzqfirstproject.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentImpl implements DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;
    @Autowired
    private DeptWithUserMapper deptWithUserMapper;
    @Override
    public List<Department> GetAll() {
        List<Department> departments = departmentMapper.selectList(null);
        return departments;
    }

    @Override
    public Department GetById(Integer id) {
        Department department = departmentMapper.selectById(id);
        return department;
    }

    @Override
    public Integer DepartmentAdd(Department department) {
        Integer i = departmentMapper.insert(department);
        return i;
    }

    @Override
    public Integer DepartmentDel(Integer id) {
        Integer i = departmentMapper.deleteById(id);
        return i;
    }

    @Override
    public Integer DepartmentUpdate(Department department) {
        Integer i = departmentMapper.update(department,null);
        return i;
    }

//    联合
    @Override
    public DeptVo findDept(Integer id) {
        DeptVo dept = deptWithUserMapper.findDept(id);
        return dept;
    }

    @Override
    public void batch(ArrayList<Department> departments) {
        for(Department d :departments)
        {
            departmentMapper.insert(d);
        }
    }

    @Override
    public void batchDel(int[] departmentid) {
        for(int i :departmentid)
        {
            departmentMapper.deleteById(i);
        }
    }


}
