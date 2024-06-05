package org.example.wzqfirstproject.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.wzqfirstproject.vo.DeptVo;

@Mapper
public interface DeptWithUserMapper {
    DeptVo findDept(Integer id);

}
