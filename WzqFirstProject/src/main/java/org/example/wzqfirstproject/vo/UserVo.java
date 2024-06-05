package org.example.wzqfirstproject.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserVo {
    private Integer id;
    private String userName;
    private String password;
    private Integer gender;
    private Date birthday;
    private Integer deptId;
    private String deptName;
    private String description;
    private String address;
}
