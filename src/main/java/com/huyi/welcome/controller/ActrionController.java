package com.huyi.welcome.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/Actrion")
public class ActrionController {

    @RequestMapping("/getActrion")
    public Map<String,String> Actrion(){
        Map<String,String> result=new HashMap<>();
        result.put("success","成功");
        return result;
    }

}
