package ru.sorokinkv.testDbEntity.Dto;

import lombok.Data;
import ru.sorokinkv.testDbEntity.model.UserEntity;

@Data
public class UserDto {
    private String name;
    private boolean isDel;

    public void setName(String name) {
        this.name = name;
    }

    public void setDel(boolean del) {
        isDel = del;
    }

    public UserEntity getEntity(){
        UserEntity userEntity = new UserEntity();
        userEntity.setName(this.name);
        userEntity.setDel(this.isDel);
        return userEntity;
    }
}
