package com.zking.spboot01.controller;

import com.zking.spboot01.Dao.StudentDao;
import com.zking.spboot01.model.Test;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author hui
 * @create 2019-12-17 13:22:09
 */
@Controller
public class HelloController {


    @Autowired
    private StudentDao dao;


    @ModelAttribute
    public void init(Model model){
         model.addAttribute("name",null);
         model.addAttribute("username","张三");
         model.addAttribute("gender",0);
        List<Test> list = new ArrayList<>();
        list.add(new Test(1,"zs"));
        list.add(new Test(2,"ls"));
        list.add(new Test(3,"ww"));
        model.addAttribute("lst",list);
    }

    @RequestMapping("/")
    public String toIndex(){
        return "index";
    }

    @RequestMapping("json")
    @ResponseBody
    public Map json(){
        Map<String,Object> json = new HashMap<>();
        json.put("success",true);
        json.put("msg","ok");
        return json;
    }

    @RequestMapping("/getByName")
    @ResponseBody
    public Object getByName(){
        return dao.findByStuname("张");
    }
}
