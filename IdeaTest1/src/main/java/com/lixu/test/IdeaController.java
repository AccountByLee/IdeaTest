package com.lixu.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Hi_Lee on 2018/5/1.
 */
@Controller
public class IdeaController {

    @RequestMapping("hello")
    @ResponseBody
    public  String sayHello(){
        System.out.println("新建一个测试分支，用于测试提交");
        return "hello" + System.currentTimeMillis() +"this is two version";
    }


}
