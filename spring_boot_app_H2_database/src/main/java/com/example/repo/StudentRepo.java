package com.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.StudentEntity;





public interface StudentRepo extends JpaRepository<StudentEntity, Integer> {

	

}
