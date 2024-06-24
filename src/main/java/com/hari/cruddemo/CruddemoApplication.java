package com.hari.cruddemo;

import com.hari.cruddemo.dao.StudentDAO;
import com.hari.cruddemo.entity.Student;
import com.hari.cruddemo.repository.StudentDAOImpl;
import jakarta.persistence.EntityManager;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){

		return runner->{
			System.out.println("Hello World");
//			createStudent(studentDAO);

			readStudent(studentDAO);
		};
	}

	public void readStudent(StudentDAO studentDAO){
		Student student = new Student("Hariharan","S","hari@gmail.com");

		studentDAO.save(student);

		System.out.println("Find by ID"+studentDAO.findById(student.getId()));


	}
	public void  createStudent(StudentDAO studentDAO){
		Student student = new Student("Hari","S","hari@gmail.com");

		System.out.println("Before Saving Entitlement");

		studentDAO.save(student);

		System.out.println("Data after saving " + student.getId() );

	}

}
