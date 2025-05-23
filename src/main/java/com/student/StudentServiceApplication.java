package com.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentServiceApplication {

//	@Autowired
//	private StudentRepository studentRepository;
//
//	@PostConstruct
//	public void init()
//	{
//		studentRepository.saveAll(Arrays.asList(new Student(101,"suneel","Hyderabad"), new Student(102,"sumanth","Bangalore"), new Student(103,"vinod","Pune")));
//	}

	public static void main(String[] args) {
		SpringApplication.run(StudentServiceApplication.class, args);
	}

}
