package org.example.wzqfirstproject.service.Impl;

import org.example.wzqfirstproject.entity.User;
import org.example.wzqfirstproject.vo.UserVo;
import org.example.wzqfirstproject.mapper.UserMapper;
import org.example.wzqfirstproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserImpl implements UserService
{

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> GetAll() {
        List<User> users = userMapper.selectList(null);
        return users;
    }

    @Override
    public User GetById(Integer id) {
        User user = userMapper.selectById(id);
        return user;
    }

    @Override
    public Integer UserAdd(User user) {
        Integer i = userMapper.insert(user);
        return i;
    }

    @Override
    public Integer UserDel(Integer id) {
        Integer i = userMapper.deleteById(id);
        return i;
    }

    @Override
    public Integer UserUpdate(User user) {
        Integer i = userMapper.update(user,null);
        return i;
    }

    @Override
    public List<UserVo> GetAllUD() {
        return userMapper.GetAllUD();
    }

    @Override
    public void batch(ArrayList<User> users) {
        for(User u : users)
        {
            userMapper.insert(u);
        }
    }

    @Override
    public ArrayList<Integer> batchDel(int[] userId) {
        ArrayList<Integer> ids=new ArrayList<>();
        for(int i : userId)
        {
            int i1 = userMapper.deleteById(i);
            if(i1!=1)
                ids.add(i);
        }
        return ids;
    }
}
