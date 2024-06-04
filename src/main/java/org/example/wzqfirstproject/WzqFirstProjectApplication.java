package org.example.wzqfirstproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.example.wzqfirstproject.mapper")
public class WzqFirstProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(WzqFirstProjectApplication.class, args);
	}

}
