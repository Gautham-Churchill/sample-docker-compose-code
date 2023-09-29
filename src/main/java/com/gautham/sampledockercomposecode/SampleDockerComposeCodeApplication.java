package com.gautham.sampledockercomposecode;

import com.gautham.sampledockercomposecode.repo.Student;
import com.gautham.sampledockercomposecode.repo.StudentRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SampleDockerComposeCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleDockerComposeCodeApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(StudentRepo studentRepo) {
		return args -> {
			if(studentRepo.count() == 0) {
				Student student = new Student(1, "Dave");
				studentRepo.save(student);
			}
		};
	}
}
