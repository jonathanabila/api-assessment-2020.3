package com.assessment.infnet.api.model.repositories;

import com.assessment.infnet.api.model.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;


@Repository
public interface IUserRepository extends CrudRepository<User, Integer>{

    @Query("from User u where u.userName = :userName and u.password = :password")
    User authenticate(String userName, String password);

    User findByUserName(String userName);
}