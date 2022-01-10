package com.example.shardingdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author: myzhao
 * @date: 2022-01-10 2:47 下午  星期一
 * @description:
 */
@Data
public class Test1 {

    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;

}
