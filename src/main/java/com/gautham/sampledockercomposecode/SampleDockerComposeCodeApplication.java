package com.gautham.sampledockercomposecode;

import com.gautham.sampledockercomposecode.repo.Student;
import com.gautham.sampledockercomposecode.repo.StudentRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class SampleDockerComposeCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleDockerComposeCodeApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(StudentRepo studentRepo) {
		return args -> {
				studentRepo.save(new Student(1, "Dave"));

				List<Student> studentList = studentRepo.findAll();
				System.out.println(studentList);
		};
	}
}
