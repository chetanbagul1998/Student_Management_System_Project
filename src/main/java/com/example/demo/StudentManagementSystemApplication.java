package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication  
{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	
	/*   implements CommandLineRunner
	 * @Autowired private StudentRepository studentRepository;
	 * 
	 * @Override public void run(String... args) throws Exception {
	 * 
	 * Student student2 = new Student("Chetan2","Bagul2","chetan2@gmail.com");
	 * studentRepository.save(student2);
	 * 
	 * }
	 */
	 

}
