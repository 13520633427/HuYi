package com.huyi.welcome.services.impl;

import com.huyi.welcome.mapper.VlogManageUserMapper;
import com.huyi.welcome.pojo.VlogManageUser;
import com.huyi.welcome.services.VlogManageUserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VlogManageUserImpl implements VlogManageUserServices {

    @Autowired
    private VlogManageUserMapper manageUserMapper;

    @Override
    public List<VlogManageUser> getManageUser() {
        return manageUserMapper.selectAll();
    }
}
