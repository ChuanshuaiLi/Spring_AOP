package com.imooc.aop.demo3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringDemo3 {

    //    @Resource(name = "studentDao")
    @Resource(name = "studentDaoProxy")
    private StudentDao studentDao;


    @Test
    public void demo() {
        studentDao.save();
        studentDao.delete();
        studentDao.update();
        studentDao.find();
    }
}
