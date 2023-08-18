package com.goit.Mod15Developer;

import com.goit.Mod15Developer.service.NoteService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class Mod15DeveloperApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Mod15DeveloperApplication.class, args);
		NoteService noteService = context.getBean(NoteService.class);
	}
}
