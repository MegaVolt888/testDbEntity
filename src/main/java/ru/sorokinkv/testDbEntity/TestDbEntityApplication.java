package ru.sorokinkv.testDbEntity;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.sorokinkv.testDbEntity.model.UserEntity;
import ru.sorokinkv.testDbEntity.service.UserService;
import ru.sorokinkv.testDbEntity.service.UserServiceImpl;

@SpringBootApplication
public class TestDbEntityApplication {


	public static void main(String[] args) {
		SpringApplication.run(TestDbEntityApplication.class, args);
	}

//	@Autowired
//	public static UserServiceImpl userService;

//	@PostConstruct
//	public static void create(){
//		userService.save(new UserEntity().createUser("Vasya",false));
//		userService.save(new UserEntity().createUser("Max",false));
//		userService.save(new UserEntity().createUser("Sergey",false));
//	}

}
