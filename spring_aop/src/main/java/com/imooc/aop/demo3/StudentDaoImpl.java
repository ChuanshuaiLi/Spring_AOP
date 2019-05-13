package com.imooc.aop.demo3;

public class StudentDaoImpl implements StudentDao {
    public void save() {
        System.out.println("保存学生...");
    }

    public void update() {
        System.out.println("修改学生...");
    }

    public void find() {
        System.out.println("查询学生...");
    }

    public void delete() {
        System.out.println("删除学生...");
    }
}
