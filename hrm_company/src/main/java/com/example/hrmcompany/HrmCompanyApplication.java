package com.example.hrmcompany;

import com.example.common.utils.SnowIdGenerate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

/**
 * @author :        ChenYanxin
 * @date :          2019/2/24 17:18
 */
@SpringBootApplication
@EntityScan("com.example.domain")
public class HrmCompanyApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrmCompanyApplication.class, args);
    }

    @Bean
    public SnowIdGenerate idWorker() {
        return new SnowIdGenerate();
    }
}
