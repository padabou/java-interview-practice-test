package com.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class JavaPracticeTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaPracticeTestApplication.class, args);
	}
}
