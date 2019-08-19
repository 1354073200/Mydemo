package com.client.dao;

import com.client.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDao {
    /**
     * 全查询
     * @return
     */
     List<User> getList();

    List<Map<String,Object>> getPersonList();
}
