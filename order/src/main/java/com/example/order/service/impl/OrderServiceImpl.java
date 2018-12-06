package com.example.order.service.impl;

import com.example.order.mapper.PersonMapper;
import com.example.order.model.Person;
import com.example.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * OrderServiceImpl
 *
 * @author :        ChenYanxin
 * @date :          2018/12/6 21:20
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private PersonMapper personMapper;
    /**
     * 以ID查询人员
     *
     * @param id 人员ID
     * @return 人员对象
     */
    @Override
    public Person getById(Integer id) {
        return personMapper.selectByPrimaryKey(id);
    }

    /**
     * 查询所有人员
     *
     * @return 人员集合
     */
    @Override
    public List<Person> listAll() {
        return personMapper.selectByExample(null);
    }

    /**
     * 插入人员数据
     *
     * @param person 人员实体
     * @return 成功个数
     */
    @Override
    public int insert(Person person) {
        return personMapper.insert(person);
    }

    /**
     * 以ID更新人员
     *
     * @param person 人员实体
     * @return 影响的行数
     */
    @Override
    public int updateById(Person person) {
        return personMapper.updateByPrimaryKeySelective(person);
    }

    /**
     * 以ID删除指定人员
     *
     * @param id 人员ID
     * @return 成功个数
     */
    @Override
    public int deleteById(Integer id) {
        return personMapper.deleteByPrimaryKey(id);
    }
}
