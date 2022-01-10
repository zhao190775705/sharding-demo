package com.example.shardingdemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.shardingdemo.entity.Test1;
import com.example.shardingdemo.mapper.Test1Mapper;
import org.springframework.stereotype.Service;

/**
 * @author: myzhao
 * @date: 2022-01-10 3:16 下午  星期一
 * @description:
 */
@Service
public class Test1ServiceImpl extends ServiceImpl<Test1Mapper, Test1> implements Test1Service  {
}
