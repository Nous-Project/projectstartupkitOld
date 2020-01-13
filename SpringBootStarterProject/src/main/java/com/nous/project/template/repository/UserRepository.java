package com.nous.project.template.repository;

import org.springframework.data.repository.CrudRepository;

import com.nous.project.template.domain.User;

/**
 * Created by sahan on 4/8/2016.
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
