package com.aj.poc.repository;

import com.aj.poc.entity.User;
import com.aj.poc.entity.UserId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface SignUpRepository extends JpaRepository<User, UserId> {

    @Query(value ="select count(*) from user where phone_number = ?1", nativeQuery = true)
    Long countByPhoneNumber(String phoneNumber);

}
