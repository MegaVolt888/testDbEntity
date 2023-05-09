package ru.sorokinkv.testDbEntity.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Data
//@Table(name = "user")
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID")
    private int id;

    @Nonnull
    @Column(name="name")
    private String name;

    @Column(name="is_del")
    private boolean isDel;

    public UserEntity createUser(String name, Boolean isDel){
        this.name=name;
        this.isDel=isDel;
        return this;
    }

}
