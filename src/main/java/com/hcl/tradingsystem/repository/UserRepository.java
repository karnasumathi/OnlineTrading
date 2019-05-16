package com.hcl.tradingsystem.repository;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.tradingsystem.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>
{

}
