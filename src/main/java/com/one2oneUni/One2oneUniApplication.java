package com.one2oneUni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class One2oneUniApplication implements CommandLineRunner{
	/*
	 * @Autowired StudentRepo studentRepo;
	 * 
	 * @Autowired InfoRepo infoRepo;
	 */

	public static void main(String[] args) {
		SpringApplication.run(One2oneUniApplication.class, args);
		System.out.println("program started :");
	}

	@Override
	public void run(String... args) throws Exception {
		
		Student student=new Student();
		student.setSt_id(101);
		student.setSt_name("sumon");
		
		Info info=new Info();
		info.setInfo_id(8798);
		info.setRollNo(370888);
		
		student.setInfo(info);
		
		//studentRepo.save(student);
		
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		// Convert the objects to JSON
		try {
		    String json = objectMapper.writeValueAsString(student);
		    System.out.println(json);
		} catch (Exception e) {
		    e.printStackTrace();
		}
		
	}

}
