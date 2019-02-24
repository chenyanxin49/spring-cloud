package com.example.hrmcompany.dao;

import com.example.domain.company.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 自定义dao接口继承
 * JpaRepository<实体类，主键>
 * JpaSpecificationExecutor<实体类>
 *
 * @author :        ChenYanxin
 * @date :          2019/2/24 17:18
 */
public interface CompanyDao extends JpaRepository<Company, String>, JpaSpecificationExecutor<Company> {
}
