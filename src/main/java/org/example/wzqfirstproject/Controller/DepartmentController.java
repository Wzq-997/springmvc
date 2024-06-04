package org.example.wzqfirstproject.Controller;

import org.example.wzqfirstproject.entity.Department;
import org.example.wzqfirstproject.entity.User;
import org.example.wzqfirstproject.vo.DeptVo;
import org.example.wzqfirstproject.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    //获取所有
    @GetMapping
    public List<Department> GetAll(){
        List<Department> departments = departmentService.GetAll();
        return departments;
    }

    //获取单个
    @GetMapping("/{id}")
    public Department GetById(@PathVariable Integer id){
        return departmentService.GetById(id);
    }

    //添加
    @PostMapping
    public String Refister(@RequestBody Department department)
    {
        if(departmentService.DepartmentAdd(department)!=0)
        {
            return "添加成功";
        }
        else {
            return "添加失败";
        }
    }
    //删除
    @DeleteMapping("/{id}")
    public String DeleteDepartment(@PathVariable int id)
    {
        departmentService.DepartmentDel(id);
        return "删除成功";
    }
    //修改
    @PutMapping
    public String ModifyDepartment(@RequestBody Department department)
    {
        Integer i = departmentService.DepartmentUpdate(department);
        if(i>0)
            return "修改成功";
        return "修改失败";
    }

    //查找部门下的所有的人
    @GetMapping("/employee/{id}")
    public DeptVo getEployee(@PathVariable Integer id)
    {
        return departmentService.findDept(id);
    }

    //批量添加
    //批量添加
    @RequestMapping("/batch")
    public String batch(@RequestBody ArrayList<Department> departments)
    {
        departmentService.batch(departments);
        return "执行完成";
    }
    //批量删除
    @RequestMapping("/batchDel")
    public String batchDel(@RequestBody int[] departmentsid)
    {
        departmentService.batchDel(departmentsid);
        return "执行完成";
    }
}
