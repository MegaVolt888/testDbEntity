package ru.sorokinkv.testDbEntity.reposiroty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sorokinkv.testDbEntity.model.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {

}
