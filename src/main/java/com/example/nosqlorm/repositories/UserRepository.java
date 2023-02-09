package com.example.nosqlorm.repositories;

import com.example.nosqlorm.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {
}
