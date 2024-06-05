package org.example.wzqfirstproject.service;

import org.example.wzqfirstproject.entity.User;
import org.example.wzqfirstproject.vo.UserVo;

import java.util.ArrayList;
import java.util.List;

public interface UserService {
    //查询所有用户
    List<User> GetAll();
    //获取单个
    User GetById(Integer id);
    //添加
    Integer UserAdd(User user);
    //删除
    Integer UserDel(Integer id);
    //修改
    Integer UserUpdate(User user);

    //员工和部门联合
    List<UserVo> GetAllUD();

    //批量添加
    void batch(ArrayList<User> users);
    ArrayList<Integer> batchDel(int[] userId);
}
