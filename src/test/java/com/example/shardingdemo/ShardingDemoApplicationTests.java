package com.example.shardingdemo;

import com.example.shardingdemo.entity.Test1;
import com.example.shardingdemo.mapper.Test1Mapper;
import com.example.shardingdemo.service.Test1Service;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class ShardingDemoApplicationTests {

    @Autowired
    private Test1Mapper test1Mapper;

    @Autowired
    private Test1Service test1Service;

    @Test
    void contextLoads() {
        Test1 test1 = new Test1();
        Test1 test2 = new Test1();
        test1.setName("1");
        test2.setName("2");
        List<Test1> objects = new ArrayList<>();
        objects.add(test2);
        objects.add(test1);
        test1Mapper.insertList(objects);
        objects.forEach(System.out::println);
    }

}
