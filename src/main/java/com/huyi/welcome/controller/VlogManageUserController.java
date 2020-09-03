package com.huyi.welcome.controller;

import com.huyi.welcome.pojo.VlogManageUser;
import com.huyi.welcome.services.VlogManageUserServices;
import com.huyi.welcome.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ManageUser")
public class VlogManageUserController {

    @Autowired
    private VlogManageUserServices manageUserServices;

    @RequestMapping("/getUser")
    public Result getUser(){
        try {
            List<VlogManageUser> manageUserList=manageUserServices.getManageUser();
            return new Result("成功","2000",manageUserList,true);
        }catch (Exception e){
            return new Result("服务器出现异常","5000",false);
        }
    }

    @RequestMapping("/Test")
    public Result getTest(){
        //异步
        
        return new Result("成功","2000",null,true);
    }

}
