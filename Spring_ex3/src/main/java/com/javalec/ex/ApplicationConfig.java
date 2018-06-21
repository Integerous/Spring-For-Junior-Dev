package com.javalec.ex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

	
	@Bean
	public Student student1() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("독서");
		hobbys.add("수영");
		
		Student student = new Student("한정수", 29, hobbys);
		student.setHeight(177);
		student.setWeight(84);
		
		return student;
	}
	
	@Bean
	public Student student2() {
		
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("축구");
		hobbys.add("테니스");
		
		Student student = new Student("Ryan", 29, hobbys);
		student.setHeight(177);
		student.setWeight(84);
		
		return student;
	}
	
	
}
