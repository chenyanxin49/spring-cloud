package com.example.hrm_company;

import com.example.domain.company.Company;
import com.example.hrmcompany.HrmCompanyApplication;
import com.example.hrmcompany.dao.CompanyDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HrmCompanyApplication.class)
public class HrmCompanyApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    private CompanyDao companyDao;

    @Test
    public void test() {

        //save(company) ;  保存或更新（id）
        //deleteByIid); 根据id删除
        //findById（id）；根据id查询
        //findAll() 查询全部

        Company company = new Company();
        company.setId("1");
        companyDao.save(company);
        System.out.println(company);
    }
}
