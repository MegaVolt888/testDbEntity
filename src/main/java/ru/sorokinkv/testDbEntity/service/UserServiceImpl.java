package ru.sorokinkv.testDbEntity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sorokinkv.testDbEntity.model.UserEntity;
import ru.sorokinkv.testDbEntity.reposiroty.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    public List<UserEntity> findAll(){
        List<UserEntity> userEntityList = userRepository.findAll();
        return userEntityList;
    }

    public UserEntity findById(int id){
        Optional<UserEntity> byId = userRepository.findById(id);
        if(byId.isPresent()){
            return byId.get();
        } else {
            return new UserEntity();
        }
    }

    public UserEntity save(UserEntity userEntity){
        return userRepository.save(userEntity);
    }
}
