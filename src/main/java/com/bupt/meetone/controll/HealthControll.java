package com.bupt.meetone.controll;

import com.bupt.meetone.model.Health;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HealthControll {

    @RequestMapping(value="health")
    @ResponseBody
    public Health health(HttpServletRequest request){
        Health health  = new Health();
        health.setHello("健康");
        return health;
    }
}
