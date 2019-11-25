package com.funtl.myshop.plus.provider.service.impl;

import com.funtl.myshop.plus.provider.mapper.UmsAdminMapper;
import com.funtl.myshop.plus.provider.service.UmsAdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UmsAdminServiceImpl implements UmsAdminService{

    @Resource
    private UmsAdminMapper umsAdminMapper;

}
