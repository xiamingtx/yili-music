package com.bilitech.yilimusic.repository;

import com.bilitech.yilimusic.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 夏明
 * @version 1.0
 */
public interface UserRepository extends JpaRepository<UserInfo, String> {
    UserInfo getByUsername(String username);
}
