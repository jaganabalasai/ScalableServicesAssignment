package com.UserRegister.User_Register.Model;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyAppUseRepository extends JpaRepository<MyAppUser, Long>{
	
	Optional<MyAppUser> findByUsername(String username);

}
