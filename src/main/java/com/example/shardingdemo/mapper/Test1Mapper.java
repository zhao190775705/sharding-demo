package com.example.shardingdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.shardingdemo.entity.Test1;

import java.util.List;

/**
 * @author: myzhao
 * @date: 2022-01-10 2:48 下午  星期一
 * @description:
 */
public interface Test1Mapper extends BaseMapper<Test1> {

    void insertList(List<Test1> list);

}
