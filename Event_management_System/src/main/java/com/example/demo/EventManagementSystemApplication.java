package com.example.demo;

import com.example.demo.entity.Mentor;
import com.example.demo.repository.MentorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EventManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(EventManagementSystemApplication.class, args);
	}
	@Autowired
	private MentorRepository mentorRepository;

	@Override
	public void run(String... args) throws Exception {
		/*Mentor mentor1=new Mentor("Ramesh","Java","15-05-2022","150 mins","ramesh@gmail.com");
		mentorRepository.save(mentor1);
		*/


	}
}
