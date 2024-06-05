package org.example.wzqfirstproject.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.wzqfirstproject.entity.User;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeptVo {
    private Integer id;
    private String deptName;
    private String description;
    private String address;
    private List<User> users;
}
