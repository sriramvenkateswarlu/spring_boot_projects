package com.example.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Request.ContactDetails;

public interface ContactRepository extends JpaRepository<ContactDetails,Integer>{

}
