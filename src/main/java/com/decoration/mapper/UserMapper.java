package com.decoration.mapper;

import com.decoration.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by dongchao on 2020/8/15 09:57
 */
@Mapper
public interface UserMapper {

    void addUser(User user);
}
