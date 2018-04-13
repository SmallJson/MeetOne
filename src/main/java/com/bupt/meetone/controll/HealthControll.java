package com.bupt.meetone.controll;

import com.bupt.meetone.mapper.HealthMapper;
import com.bupt.meetone.model.Health;
import com.bupt.meetone.model.health.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
//没有业务意义，测试框架是否运行
@Controller
public class HealthControll {
    @Autowired
    private HealthMapper accountMapper;

    @RequestMapping(value="health")
    @ResponseBody
    public Health health(HttpServletRequest request){
        Health health  = new Health();
        health.setHello("健康");
        return health;
    }
    @RequestMapping(value = "mysql")
    @ResponseBody
    public List<Account> healthMysql(HttpServletRequest request){
        return accountMapper.getAll();
    }
}
