package com.nepka.dao;

import java.util.List;

public interface DAO<T>{
    //增加
    void add(T row);
    //修改
    void update(T row);
    //删除
    void delete(int id);
    //获取
    T get(int id);
    //查询
    List<T> list();
    //分页查询
    List<T> list(int start, int count);
}