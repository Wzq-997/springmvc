package org.example.wzqfirstproject.Controller;

import org.apache.log4j.Logger;
import org.example.wzqfirstproject.entity.User;
import org.example.wzqfirstproject.vo.UserVo;
import org.example.wzqfirstproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private Logger logger = Logger.getLogger(UserController.class);
    @Autowired
    private UserService userService;
    //获取所有
    @GetMapping
    public List<User> GetAll(){
        List<User> users = userService.GetAll();
        logger.info("查询成功-->" + users.toString());
        return users;
    }

    //获取单个
    @GetMapping("/{id}")
    public User GetById(@PathVariable Integer id){
        return userService.GetById(id);
    }

    //添加
    @PostMapping
    public String Refister(@RequestBody User user)
    {
        if(userService.UserAdd(user)!=0)
        {
            logger.info("前端传来的数据:注册成功");
            return "注册成功";
        }
        else {
            return "注册失败";
        }
    }
    //删除
    @DeleteMapping("/{id}")
    public String DeleteUser(@PathVariable int id)
    {
        userService.UserDel(id);
        return "删除成功";
    }
    //修改
    @PutMapping
    public String ModifyUser(@RequestBody User user)
    {
        Integer i = userService.UserUpdate(user);
        if(i>0)
        {
            logger.info("修改成功");
            return "修改成功";
        }
        return "修改失败";
    }

    //员工和部门联合查询
    @GetMapping("/findUserDept")
    public List<UserVo> findUserDept(){
        List<UserVo> userVos = userService.GetAllUD();
        return userVos;
    }

    //批量添加
    @RequestMapping("/batch")
    public String batch(@RequestBody ArrayList<User> users)
    {
        userService.batch(users);
        return "执行完成";
    }

    //批量删除
    @RequestMapping("/batchDel")
    public String batchDel(@RequestBody int[] userId)
    {
        ArrayList<Integer> integers = userService.batchDel(userId);
        if(integers.size()>0)
        {
            String tips=integers.get(0).toString();
            for(int i = 1;i<integers.size();i++)
                tips+=","+integers.get(i);
            return "id为："+tips+"这些用户不存在，其余执行完成";
        }
        return "执行完成";
    }
}
