package com.example.demo.control;

import com.example.demo.entity.User;
import com.example.demo.config.UserFegin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class UserControl {

    @Autowired
    private UserFegin userFegin;

    @RequestMapping(value = "/user/getList",method = RequestMethod.GET)
    public List<User> getList(){
        System.err.println("I进入粒子层！");
        List<User> list=this.userFegin.getList();
        System.err.println("粒子层全查询数据"+list);
        return list;
    }

    @RequestMapping(value = "/person/getPersonList",method = RequestMethod.GET)
    public List<Map<String,Object>> getPersonList(){
        System.err.println("I进入粒子层！");
        List<Map<String,Object>> list=this.userFegin.getPersonList();
        System.err.println("粒子层全查询数据"+list);
        return list;
    }
}
