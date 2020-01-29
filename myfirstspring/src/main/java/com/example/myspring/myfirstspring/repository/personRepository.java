package com.example.myspring.myfirstspring.repository;

import com.example.myspring.myfirstspring.model.person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface personRepository extends JpaRepository<person,Long> {
}
