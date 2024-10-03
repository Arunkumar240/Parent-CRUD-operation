package com.parents.parentsdemo.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parents.parentsdemo.entity.ParentsEntity;
@Repository
public interface ParentsRepository extends JpaRepository< ParentsEntity, UUID>{

}
