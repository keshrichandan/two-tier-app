package com.java.two_tier_app;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("SELECT u FROM User u WHERE u.firstName = :firstName AND u.lastName = :lastName")
    User findByName(@Param("firstName") String firstName,
                    @Param("lastName") String lastName);
}