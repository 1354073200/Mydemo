package com.example.demo.config;

import com.example.demo.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

@FeignClient(value="springClient")
public interface UserFegin {

    @RequestMapping(value = "/user/getList",method = RequestMethod.GET)
    public List<User> getList();

    @RequestMapping(value = "/user/getPersonList",method = RequestMethod.GET)
    public List<Map<String,Object>> getPersonList();
}
