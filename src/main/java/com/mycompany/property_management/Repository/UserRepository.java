package com.mycompany.property_management.Repository;
import com.mycompany.property_management.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<UserEntity, Long> {

    Optional<UserEntity> findByOwnerEmailAndPassword(String email, String password);
    Optional<UserEntity> findByOwnerEmail(String email);
}
