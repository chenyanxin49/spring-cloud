package com.example.order.service;

import com.example.order.model.Person;

import java.util.List;

/**
 * OrderService
 *
 * @author :        ChenYanxin
 * @date :          2018/12/6 21:20
 */
public interface OrderService {

    /**
     * 以ID查询人员
     *
     * @param id 人员ID
     * @return 人员对象
     */
    Person getById(Integer id);

    /**
     * 查询所有人员
     *
     * @return 人员集合
     */
    List<Person> listAll();

    /**
     * 插入人员数据
     *
     * @param person 人员实体
     * @return 成功个数
     */
    int insert(Person person);

    /**
     * 以ID更新人员
     *
     * @param person 人员实体
     * @return 影响的行数
     */
    int updateById(Person person);

    /**
     * 以ID删除指定人员
     *
     * @param id 人员ID
     * @return 成功个数
     */
    int deleteById(Integer id);
}
