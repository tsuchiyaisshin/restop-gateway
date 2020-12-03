package com.restop.gateway.repositories;

import com.restop.gateway.model.UserDO;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@EnableScan
public interface UserRepository extends CrudRepository<UserDO, String> {

    List<UserDO> findByName(String name);

}
