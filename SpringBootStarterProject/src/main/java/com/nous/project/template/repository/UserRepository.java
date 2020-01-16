package com.nous.project.template.repository;

import org.springframework.data.repository.CrudRepository;

import com.nous.project.template.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
