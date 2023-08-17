package com.goit.Mod15Developer;
import com.goit.Mod15Developer.data.entity.AuthorityEntity;
import com.goit.Mod15Developer.data.entity.Role;
import com.goit.Mod15Developer.data.entity.UserEntity;
import com.goit.Mod15Developer.data.repository.AuthorityRepository;
import com.goit.Mod15Developer.data.repository.UserRepository;
import com.goit.Mod15Developer.service.NoteService;
import org.apache.catalina.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Arrays;

@SpringBootApplication
public class Mod15DeveloperApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Mod15DeveloperApplication.class, args);
		NoteService noteService = context.getBean(NoteService.class);

		UserRepository userRepository = context.getBean(UserRepository.class);
		PasswordEncoder passwordEncoder = context.getBean(PasswordEncoder.class);
		AuthorityRepository authorityRepository = context.getBean(AuthorityRepository.class);

		// Create and save a user
	UserEntity user1 = new UserEntity();
        user1.setUsername("admin");
        user1.setPassword(passwordEncoder.encode("passadmin"));
        user1.setEnabled(String.valueOf(true));
        user1.setEmail("admin@test.com");
	UserEntity user2 = new UserEntity();
		user2.setUsername("user");
		user2.setPassword(passwordEncoder.encode("jdbcDefault"));
		user2.setEnabled(String.valueOf(true));
		user2.setEmail("user@test.com");
	UserEntity user3 = new UserEntity();
		user3.setUsername("user1");
		user3.setPassword(passwordEncoder.encode("passuser1"));
		user3.setEnabled(String.valueOf(true));
		user3.setEmail("user1@test.com");
		userRepository.save(user1);
        userRepository.save(user2);
		userRepository.save(user3);

		AuthorityEntity authority = new AuthorityEntity();
		authority.setUser(user1);
		authority.setAuthority(Role.ADMIN);

		AuthorityEntity authority1 = new AuthorityEntity();
		authority1.setUser(user2);
		authority1.setAuthority(Role.USER);

		AuthorityEntity authority2 = new AuthorityEntity();
		authority2.setUser(user3);
		authority2.setAuthority(Role.USER);


	}
}
