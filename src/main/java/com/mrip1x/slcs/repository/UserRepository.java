package com.mrip1x.slcs.repository;

import com.mrip1x.slcs.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    User findOneByEmail(String email);
    User findOneByLogin(String email);
}
