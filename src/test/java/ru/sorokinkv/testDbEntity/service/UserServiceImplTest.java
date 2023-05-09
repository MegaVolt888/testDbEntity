package ru.sorokinkv.testDbEntity.service;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.event.annotation.BeforeTestExecution;
import org.springframework.test.context.event.annotation.BeforeTestMethod;
import ru.sorokinkv.testDbEntity.model.UserEntity;
import ru.sorokinkv.testDbEntity.reposiroty.UserRepository;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

    private static List<UserEntity> userList;

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserServiceImpl userService;




    @Test
    void findAll() {
        Mockito.when(userRepository.findAll()).thenReturn(userList);
        List<UserEntity> result = userService.findAll();

        Assertions.assertNotNull(result);
        Assertions.assertEquals(2, result.size());
        Assertions.assertEquals(userList.get(0),result.get(0));
        Assertions.assertEquals(userList.get(1),result.get(1));
    }

    @Test
    void findById() {
        Mockito.when(userRepository.findById(1)).thenReturn(Optional.ofNullable(userList.get(0)));
        UserEntity result = userService.findById(1);

        Assertions.assertNotNull(result);
        Assertions.assertEquals(userList.get(0),result);
    }

    @Test
    void save() {
//        userRepository.save(userList.get(0));
        Mockito.when(userRepository.save(userList.get(0))).thenReturn(userList.get(0));
        UserEntity result = userService.save(userList.get(0));

        Assertions.assertNotNull(result);
        Assertions.assertEquals(userList.get(0),result);
    }

    @BeforeEach
    public void createUsers() {
        UserEntity firstUser = new UserEntity();
        UserEntity secondUser = new UserEntity();

        firstUser.setId(1);
        firstUser.setName("Max");
        firstUser.setDel(false);

        secondUser.setId(2);
        secondUser.setName("Den");
        secondUser.setDel(false);

        userList = List.of(firstUser, secondUser);
    }
}