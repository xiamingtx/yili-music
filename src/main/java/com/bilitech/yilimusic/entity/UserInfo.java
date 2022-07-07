package com.bilitech.yilimusic.entity;

import com.bilitech.yilimusic.enums.Gender;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * @author 夏明
 * @version 1.0
 */

@Entity
@Data
public class UserInfo extends AbstractEntity{

    @Column(unique = true)
    private String username;

    private String nickname;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name ="role_id", referencedColumnName = "id"))
    private List<RoleInfo> roles; // 关联数据

    private String password;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private Boolean locked;

    private Boolean enabled;

    private String lastLoginIp;

    private Date lastLoginTime;
}
