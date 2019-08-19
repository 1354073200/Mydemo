package com.client.control;

import com.client.dao.UserDao;
import com.client.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RestController
public class UserControl {

    @Value("${server.port}")
    String mySelfPort;
    @Value("${eureka.instance.metadata-map.version}")
    private String version;

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/user/getList",method = RequestMethod.GET)
    public List<User> getList(){
        System.err.println("I进入粒子层！");
        List<User> list=this.userDao.getList();
        System.err.println("粒子层全查询数据"+list);
        return list;
    }

    @RequestMapping(value = "/person/getPersonList",method = RequestMethod.GET)
    public List<Map<String,Object>> getPersonList(){
        System.err.println("I进入粒子层！");
        List<Map<String,Object>> list=this.userDao.getPersonList();
        System.err.println("粒子层全查询数据"+list);
        return list;
    }

    /**
     * 获取本服务端口号
     * @return
     */
    @GetMapping("getPort")
    public String getPort(){
        return "本服务的端口号为："+mySelfPort;
    }

    /**
     * 获取本服务版本号
     * @return
     */
    @GetMapping("getVersion")
    public String getVersion(){
        return "本服务的端口号为："+version;
    }

}
