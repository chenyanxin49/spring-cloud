package com.example.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * PageResult  分布结果返回
 *
 * @author :        ChenYanxin
 * @date :          2019/2/24 16:45
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageResult<T> {
    private Integer total;
    private List<T> rows;
}
