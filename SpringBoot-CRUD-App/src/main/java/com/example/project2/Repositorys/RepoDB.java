package com.example.project2.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project2.EntityDB.EntityDB;

public interface RepoDB extends JpaRepository<EntityDB,Integer> {

}
