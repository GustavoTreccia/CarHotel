package com.one.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.one.demo.entities.CarReg;

public interface CarRegRepository extends JpaRepository<CarReg, Long>{

}
